const app = angular.module("shopping-cart-app", []);

app.controller("shopping-cart-ctrl", function($scope, $http) {
	if(document.getElementById("user") == null){
			$scope.cart = {
		items: [],
		add(id) {
			var item = this.items.find(item => item.id == id);
			if (item) {
				item.qty++;
				this.saveToSessionStorage();
			} else {
				$http.get(`/api/products/${id}`).then(resp => {
					resp.data.qty = 1;
					this.items.push(resp.data);
					this.saveToSessionStorage();
				})
			}
		},
		
		remove(id){
			var index = this.items.findIndex(item => item.id == id);
			this.items.splice(index,1);
			this.saveToSessionStorage();
		},
		
		clear(){
			this.items = [];
			this.saveToSessionStorage();
		},

		get count() {
			return this.items
				.map(item => item.qty)
				.reduce((total, qty) => total += qty, 0);
		},

		get amount() {
			return this.items
				.map(item => item.qty * item.price)
				.reduce((total, qty) => total += qty, 0);
		},

		saveToSessionStorage() {
			var json = JSON.stringify(angular.copy(this.items));
			sessionStorage.setItem("cart-tco", json);
		},
		
		loadFromSessionStorage(){
			var json = sessionStorage.getItem("cart-tco");
			this.items = json ? JSON.parse(json) : [];
		},

		// format giá tiền
		formatNumber(value) {
			return value.toString().replace(/\B(?=(\d{3})+(?!\d))/g, ",");
		},

		// tính phí ship
		vat(){
			return 30000;
		},
		
		get ship() {
			if(this.count == 0){
				return 0;
			}else if(this.count > 2){
				return 15000;
			}else if(this.amount > 10000000){
				return 0;
			}

		},
	
	}
	$scope.cart.loadFromSessionStorage();
	

	
	$scope.order = {
		createDate : new Date(),
		address : "",
		phoneNumber : "",
		user: {username:"abc"},
		get orderDetails(){
			return $scope.cart.items.map(item => {
				return{
					product:{id : item.id},
					price: item.price,
					quantity : item.qty,
					name : item.name
				}
			});
		},
		purchase(){
			var order = angular.copy(this);
			$http.post("/rest/orders",order).then(resp => {
				alert("Đặt hàng thành công");
				$scope.cart.clear();
				location.href="/order/detail/" + resp.data.id;
			}).catch(error => {
				alert("Đặt hàng lỗi!")
				console.log(error)
				
			})
		}
		
	}
	}else{
		$scope.cart = {
		items: [],
		add(id) {
			var item = this.items.find(item => item.id == id);
			if (item) {
				item.qty++;
				this.saveToSessionStorage();
			} else {
				$http.get(`/api/products/${id}`).then(resp => {
					resp.data.qty = 1;
					this.items.push(resp.data);
					this.saveToSessionStorage();
				})
			}
		},
		
		remove(id){
			var index = this.items.findIndex(item => item.id == id);
			this.items.splice(index,1);
			this.saveToSessionStorage();
		},
		
		clear(){
			this.items = [];
			this.saveToSessionStorage();
		},

		get count() {
			return this.items
				.map(item => item.qty)
				.reduce((total, qty) => total += qty, 0);
		},

		get amount() {
			return this.items
				.map(item => item.qty * item.price)
				.reduce((total, qty) => total += qty, 0);
		},

		saveToSessionStorage() {
			var json = JSON.stringify(angular.copy(this.items));
			sessionStorage.setItem("cart-tco", json);
		},
		
		loadFromSessionStorage(){
			var json = sessionStorage.getItem("cart-tco");
			this.items = json ? JSON.parse(json) : [];
		},

		// format giá tiền
		formatNumber(value) {
			return value.toString().replace(/\B(?=(\d{3})+(?!\d))/g, ",");
		},

		// tính phí ship
		vat(){
			return 30000;
		},
		
		get ship() {
			if(this.count == 0){
				return 0;
			}else if(this.count > 2){
				return 15000;
			}else if(this.amount > 10000000){
				return 0;
			}

		},
	
	}
	$scope.cart.loadFromSessionStorage();
	

	
	$scope.order = {
		createDate : new Date(),
		address : "",
		phoneNumber : "",
		user: {username:  document.getElementById("user").innerText},
		get orderDetails(){
			return $scope.cart.items.map(item => {
				return{
					product:{id : item.id},
					price: item.price,
					quantity : item.qty,
					name : item.name
				}
			});
		},
		purchase(){
			var order = angular.copy(this);
			$http.post("/rest/orders",order).then(resp => {
				alert("Đặt hàng thành công");
				$scope.cart.clear();
				location.href="/order/detail/" + resp.data.id;
			}).catch(error => {
				alert("Đặt hàng lỗi!")
				console.log(error)
				
			})
		}
		
	}
	};
	
	
})