(self.mfeModules=self.mfeModules||[]).push(["pcmall-bundledeal",["React","PlatformApi","ReactRedux","Redux","ReactHelmet","ReactRouter","Platform","WithInjectReducer","FeatureToggles","ReactDom","Account","NebulaCore"],function(e,t,n,r,o,i,a,u,c,l,f,d){return["",function(){"use strict";var s,h,p,v,y,g,m={5990:function(e,t,n){var r=Object.freeze({INIT:0,REQ:1,OK:2,ERR:3});Object.freeze({apiProgress:r.INIT,error:null,error_msg:null}),t.Z=r},8100:function(e,t,n){n.d(t,{O:function(){return u}});var r=n(3804);function o(){o=function(){return e};var e={},t=Object.prototype,n=t.hasOwnProperty,r="function"==typeof Symbol?Symbol:{},i=r.iterator||"@@iterator",a=r.asyncIterator||"@@asyncIterator",u=r.toStringTag||"@@toStringTag";function c(e,t,n){return Object.defineProperty(e,t,{value:n,enumerable:!0,configurable:!0,writable:!0}),e[t]}try{c({},"")}catch(D){c=function(e,t,n){return e[t]=n}}function l(e,t,n,r){var o=t&&t.prototype instanceof s?t:s,i=Object.create(o.prototype),a=new O(r||[]);return i._invoke=function(e,t,n){var r="suspendedStart";return function(o,i){if("executing"===r)throw new Error("Generator is already running");if("completed"===r){if("throw"===o)throw i;return{value:void 0,done:!0}}for(n.method=o,n.arg=i;;){var a=n.delegate;if(a){var u=_(a,n);if(u){if(u===d)continue;return u}}if("next"===n.method)n.sent=n._sent=n.arg;else if("throw"===n.method){if("suspendedStart"===r)throw r="completed",n.arg;n.dispatchException(n.arg)}else"return"===n.method&&n.abrupt("return",n.arg);r="executing";var c=f(e,t,n);if("normal"===c.type){if(r=n.done?"completed":"suspendedYield",c.arg===d)continue;return{value:c.arg,done:n.done}}"throw"===c.type&&(r="completed",n.method="throw",n.arg=c.arg)}}}(e,n,a),i}function f(e,t,n){try{return{type:"normal",arg:e.call(t,n)}}catch(D){return{type:"throw",arg:D}}}e.wrap=l;var d={};function s(){}function h(){}function p(){}var v={};c(v,i,(function(){return this}));var y=Object.getPrototypeOf,g=y&&y(y(S([])));g&&g!==t&&n.call(g,i)&&(v=g);var m=p.prototype=s.prototype=Object.create(v);function b(e){["next","throw","return"].forEach((function(t){c(e,t,(function(e){return this._invoke(t,e)}))}))}function E(e,t){function r(o,i,a,u){var c=f(e[o],e,i);if("throw"!==c.type){var l=c.arg,d=l.value;return d&&"object"==typeof d&&n.call(d,"__await")?t.resolve(d.__await).then((function(e){r("next",e,a,u)}),(function(e){r("throw",e,a,u)})):t.resolve(d).then((function(e){l.value=e,a(l)}),(function(e){return r("throw",e,a,u)}))}u(c.arg)}var o;this._invoke=function(e,n){function i(){return new t((function(t,o){r(e,n,t,o)}))}return o=o?o.then(i,i):i()}}function _(e,t){var n=e.iterator[t.method];if(void 0===n){if(t.delegate=null,"throw"===t.method){if(e.iterator.return&&(t.method="return",t.arg=void 0,_(e,t),"throw"===t.method))return d;t.method="throw",t.arg=new TypeError("The iterator does not provide a 'throw' method")}return d}var r=f(n,e.iterator,t.arg);if("throw"===r.type)return t.method="throw",t.arg=r.arg,t.delegate=null,d;var o=r.arg;return o?o.done?(t[e.resultName]=o.value,t.next=e.nextLoc,"return"!==t.method&&(t.method="next",t.arg=void 0),t.delegate=null,d):o:(t.method="throw",t.arg=new TypeError("iterator result is not an object"),t.delegate=null,d)}function P(e){var t={tryLoc:e[0]};1 in e&&(t.catchLoc=e[1]),2 in e&&(t.finallyLoc=e[2],t.afterLoc=e[3]),this.tryEntries.push(t)}function L(e){var t=e.completion||{};t.type="normal",delete t.arg,e.completion=t}function O(e){this.tryEntries=[{tryLoc:"root"}],e.forEach(P,this),this.reset(!0)}function S(e){if(e){var t=e[i];if(t)return t.call(e);if("function"==typeof e.next)return e;if(!isNaN(e.length)){var r=-1,o=function t(){for(;++r<e.length;)if(n.call(e,r))return t.value=e[r],t.done=!1,t;return t.value=void 0,t.done=!0,t};return o.next=o}}return{next:w}}function w(){return{value:void 0,done:!0}}return h.prototype=p,c(m,"constructor",p),c(p,"constructor",h),h.displayName=c(p,u,"GeneratorFunction"),e.isGeneratorFunction=function(e){var t="function"==typeof e&&e.constructor;return!!t&&(t===h||"GeneratorFunction"===(t.displayName||t.name))},e.mark=function(e){return Object.setPrototypeOf?Object.setPrototypeOf(e,p):(e.__proto__=p,c(e,u,"GeneratorFunction")),e.prototype=Object.create(m),e},e.awrap=function(e){return{__await:e}},b(E.prototype),c(E.prototype,a,(function(){return this})),e.AsyncIterator=E,e.async=function(t,n,r,o,i){void 0===i&&(i=Promise);var a=new E(l(t,n,r,o),i);return e.isGeneratorFunction(n)?a:a.next().then((function(e){return e.done?e.value:a.next()}))},b(m),c(m,u,"Generator"),c(m,i,(function(){return this})),c(m,"toString",(function(){return"[object Generator]"})),e.keys=function(e){var t=[];for(var n in e)t.push(n);return t.reverse(),function n(){for(;t.length;){var r=t.pop();if(r in e)return n.value=r,n.done=!1,n}return n.done=!0,n}},e.values=S,O.prototype={constructor:O,reset:function(e){if(this.prev=0,this.next=0,this.sent=this._sent=void 0,this.done=!1,this.delegate=null,this.method="next",this.arg=void 0,this.tryEntries.forEach(L),!e)for(var t in this)"t"===t.charAt(0)&&n.call(this,t)&&!isNaN(+t.slice(1))&&(this[t]=void 0)},stop:function(){this.done=!0;var e=this.tryEntries[0].completion;if("throw"===e.type)throw e.arg;return this.rval},dispatchException:function(e){if(this.done)throw e;var t=this;function r(n,r){return a.type="throw",a.arg=e,t.next=n,r&&(t.method="next",t.arg=void 0),!!r}for(var o=this.tryEntries.length-1;o>=0;--o){var i=this.tryEntries[o],a=i.completion;if("root"===i.tryLoc)return r("end");if(i.tryLoc<=this.prev){var u=n.call(i,"catchLoc"),c=n.call(i,"finallyLoc");if(u&&c){if(this.prev<i.catchLoc)return r(i.catchLoc,!0);if(this.prev<i.finallyLoc)return r(i.finallyLoc)}else if(u){if(this.prev<i.catchLoc)return r(i.catchLoc,!0)}else{if(!c)throw new Error("try statement without catch or finally");if(this.prev<i.finallyLoc)return r(i.finallyLoc)}}}},abrupt:function(e,t){for(var r=this.tryEntries.length-1;r>=0;--r){var o=this.tryEntries[r];if(o.tryLoc<=this.prev&&n.call(o,"finallyLoc")&&this.prev<o.finallyLoc){var i=o;break}}i&&("break"===e||"continue"===e)&&i.tryLoc<=t&&t<=i.finallyLoc&&(i=null);var a=i?i.completion:{};return a.type=e,a.arg=t,i?(this.method="next",this.next=i.finallyLoc,d):this.complete(a)},complete:function(e,t){if("throw"===e.type)throw e.arg;return"break"===e.type||"continue"===e.type?this.next=e.arg:"return"===e.type?(this.rval=this.arg=e.arg,this.method="return",this.next="end"):"normal"===e.type&&t&&(this.next=t),d},finish:function(e){for(var t=this.tryEntries.length-1;t>=0;--t){var n=this.tryEntries[t];if(n.finallyLoc===e)return this.complete(n.completion,n.afterLoc),L(n),d}},catch:function(e){for(var t=this.tryEntries.length-1;t>=0;--t){var n=this.tryEntries[t];if(n.tryLoc===e){var r=n.completion;if("throw"===r.type){var o=r.arg;L(n)}return o}}throw new Error("illegal catch attempt")},delegateYield:function(e,t,n){return this.delegate={iterator:S(e),resultName:t,nextLoc:n},"next"===this.method&&(this.arg=void 0),d}},e}function i(e,t,n,r,o,i,a){try{var u=e[i](a),c=u.value}catch(l){return void n(l)}u.done?t(c):Promise.resolve(c).then(r,o)}var a=r.createContext(function(){var e,t=(e=o().mark((function e(t){return o().wrap((function(e){for(;;)switch(e.prev=e.next){case 0:e.next=2;break;case 2:case"end":return e.stop()}}),e)})),function(){var t=this,n=arguments;return new Promise((function(r,o){var a=e.apply(t,n);function u(e){i(a,r,o,u,c,"next",e)}function c(e){i(a,r,o,u,c,"throw",e)}u(void 0)}))});return function(e){return t.apply(this,arguments)}}());function u(){return r.useContext(a)}t.Z=a},1124:function(e,t,n){n.d(t,{ZP:function(){return u},LN:function(){return c},JA:function(){return l},Bf:function(){return f}});var r=n(3804);function o(){return o=Object.assign?Object.assign.bind():function(e){for(var t=1;t<arguments.length;t++){var n=arguments[t];for(var r in n)Object.prototype.hasOwnProperty.call(n,r)&&(e[r]=n[r])}return e},o.apply(this,arguments)}var i=r.createContext(void 0),a=r.createContext({});function u(e){var t=e.targetData,n=e.targetType,u=e.children,d=c(),s=l(),h=f(d,n),p=(0,r.useMemo)((function(){return function(e,t){return t?e?o({},e,t):t:e}(s,t)}),[s,t]);return r.createElement(i.Provider,{value:h},r.createElement(a.Provider,{value:p},u))}function c(){return r.useContext(i)}function l(){return r.useContext(a)}function f(e,t){return t?e?e+"."+t:t:e}},7310:function(e,t,n){var r,o,i,a,u,c,l,f,d;n.d(t,{rL:function(){return o},bU:function(){return i},vy:function(){return a},v8:function(){return u},FY:function(){return f},JM:function(){return d}}),n(5990),function(e){e[e.SHOPEE=0]="SHOPEE",e[e.SHOPEE_MULTI_SHOP=1]="SHOPEE_MULTI_SHOP",e[e.SELLER=2]="SELLER"}(r||(r={})),function(e){e[e.DELETED=0]="DELETED",e[e.NORMAL=1]="NORMAL",e[e.ENDED=2]="ENDED",e[e.UPCOMING=3]="UPCOMING"}(o||(o={})),function(e){e[e.UNKNOWN=0]="UNKNOWN",e[e.FIX_PRICE=1]="FIX_PRICE",e[e.DISCOUNT_PERCENTAGE=2]="DISCOUNT_PERCENTAGE",e[e.DISCOUNT_VALUE=3]="DISCOUNT_VALUE"}(i||(i={})),function(e){e.PDP_SECTION="PdpBundleDeal",e.PDP_LANDING_PAGE="PdpBundleDealLandingPage",e.SHOP_SECTION="ShopBundleDeal",e.SHOP_LANDING_PAGE="ShopBundleDealLandingPage",e.MART_SECTION="MartBundleDeal",e.MART_LANDING_PAGE="MartBundleDealLandingPage"}(a||(a={})),function(e){e.inactiveShop="inactiveShop",e.semiInactiveShop="semiInactiveShop",e.shopVacation="shopVacation"}(u||(u={})),function(e){e.Impression="impression",e.Click="click",e.PageState="pageState",e.Action="action"}(c||(c={})),function(e){e.PC="pc",e.RW="rweb"}(l||(l={})),function(e){e[e.PDP=1]="PDP",e[e.CART=2]="CART"}(f||(f={})),function(e){e[e.HAS_INVALID_BUNDLE=0]="HAS_INVALID_BUNDLE",e[e.IS_MAX_BUNDLE_GROUPS=1]="IS_MAX_BUNDLE_GROUPS",e[e.IS_PURCHASE_LIMIT_REACHED=2]="IS_PURCHASE_LIMIT_REACHED",e[e.HAS_MAX_TIER_BUNDLE=3]="HAS_MAX_TIER_BUNDLE",e[e.ADD_MORE_ITEMS=4]="ADD_MORE_ITEMS"}(d||(d={}))},117:function(e,t,n){n.d(t,{Z:function(){return m}});var r=n(3804),o=n(7310),i=n(6704),a=n(8100);function u(e){var t=e.children,n=e.onTrack;return r.createElement(a.Z.Provider,{value:n},t)}var c,l=n(1124),f=["pageType","targetType","targetData"],d=r.lazy((function(){return Promise.all([n.e(843),n.e(296),n.e(341)]).then(n.bind(n,8150))})),s=r.lazy((function(){return Promise.all([n.e(843),n.e(296),n.e(340)]).then(n.bind(n,4383))})),h=r.lazy((function(){return Promise.all([n.e(843),n.e(296),n.e(557)]).then(n.bind(n,6269))})),p=r.lazy((function(){return Promise.all([n.e(843),n.e(296),n.e(959),n.e(268)]).then(n.bind(n,6382))})),v=r.lazy((function(){return Promise.all([n.e(843),n.e(691),n.e(296),n.e(710)]).then(n.bind(n,4390))})),y=r.lazy((function(){return Promise.all([n.e(843),n.e(296),n.e(959),n.e(176)]).then(n.bind(n,6830))})),g=((c={})[o.vy.PDP_SECTION]=d,c[o.vy.PDP_LANDING_PAGE]=s,c[o.vy.SHOP_SECTION]=h,c[o.vy.SHOP_LANDING_PAGE]=p,c[o.vy.MART_SECTION]=v,c[o.vy.MART_LANDING_PAGE]=y,c);function m(e){var t=e.pageType,n=e.targetType,o=void 0===n?"":n,a=e.targetData,c=void 0===a?{}:a,d=function(e,t){if(null==e)return{};var n,r,o={},i=Object.keys(e);for(r=0;r<i.length;r++)n=i[r],t.indexOf(n)>=0||(o[n]=e[n]);return o}(e,f),s=g[t]||"div";return r.createElement(r.Suspense,{fallback:r.createElement("div",null)},r.createElement(u,{onTrack:i.Tracking.onTrack},r.createElement(l.ZP,{targetType:o,targetData:c},r.createElement(s,d))))}},17:function(e){e.exports=f},1437:function(e){e.exports=c},3696:function(e){e.exports=d},6161:function(e){e.exports=a},6704:function(e){e.exports=t},3804:function(t){t.exports=e},7274:function(e){e.exports=l},7385:function(e){e.exports=o},5325:function(e){e.exports=n},6775:function(e){e.exports=i},4857:function(e){e.exports=r},7762:function(e){e.exports=u}},b={};function E(e){if(b[e])return b[e].exports;var t=b[e]={exports:{}};return m[e].call(t.exports,t,t.exports,E),t.exports}return E.m=m,E.n=function(e){var t=e&&e.__esModule?function(){return e.default}:function(){return e};return E.d(t,{a:t}),t},h=Object.getPrototypeOf?function(e){return Object.getPrototypeOf(e)}:function(e){return e.__proto__},E.t=function(e,t){if(1&t&&(e=this(e)),8&t)return e;if("object"==typeof e&&e){if(4&t&&e.__esModule)return e;if(16&t&&"function"==typeof e.then)return e}var n=Object.create(null);E.r(n);var r={};s=s||[null,h({}),h([]),h(h)];for(var o=2&t&&e;"object"==typeof o&&!~s.indexOf(o);o=h(o))Object.getOwnPropertyNames(o).forEach((function(t){r[t]=function(){return e[t]}}));return r.default=function(){return e},E.d(n,r),n},E.d=function(e,t){for(var n in t)E.o(t,n)&&!E.o(e,n)&&Object.defineProperty(e,n,{enumerable:!0,get:t[n]})},E.f={},E.e=function(e){return Promise.all(Object.keys(E.f).reduce((function(t,n){return E.f[n](e,t),t}),[]))},E.u=function(e){return"bundledeal/"+({176:"BundleDealMartLandingPage",268:"BundleDealShopLandingPage",340:"BundleDealPdpLandingPage",341:"BundleDealPdpSection",557:"BundleDealShopSection",710:"BundleDealMartSection"}[e]||e)+"."+{7:"789603d842d041edd471",176:"d34eb98148fd7b52ab0a",232:"3d41cf6ec0d7ca66ff04",268:"2f97046c46a7c34d643c",296:"4d89beeb154aa47694c8",340:"2a1e5cf54b60ea770394",341:"8a3c0a1a6ac79220e442",353:"953b3523cd50e8af01bc",380:"46adaf05b6a98bcd84c5",557:"5cb5f32c923ac85d037b",691:"2cd270f46774c117333f",710:"ad374970f7218a4b0066",843:"a56d1ffc5cc68663a551",860:"88bea54b5b40338e9a6a",942:"1747fb593fafac4ced79",943:"e179d2b43694d1444eb6",959:"2944bf2c7b8556f9e8e7",984:"85fa40953683c9404ab4"}[e]+".legacy.js"},E.miniCssF=function(e){return"bundledeal/"+({176:"BundleDealMartLandingPage",268:"BundleDealShopLandingPage",340:"BundleDealPdpLandingPage",341:"BundleDealPdpSection",557:"BundleDealShopSection",710:"BundleDealMartSection"}[e]||e)+"."+{176:"f86c36be39a796c36ab5",268:"f86c36be39a796c36ab5",340:"e323916292ea5346047a",341:"fc6d95d9885543a68793",557:"ed7883f73012eb89fb59",710:"5d39e0ed25e7f5796dea",843:"6024a375402d6d526e49"}[e]+".legacy.css"},E.g=function(){if("object"==typeof globalThis)return globalThis;try{return this||new Function("return this")()}catch(e){if("object"==typeof window)return window}}(),E.o=function(e,t){return Object.prototype.hasOwnProperty.call(e,t)},p={},v="@shopee/pc-bundle-deal:",E.l=function(e,t,n,r){if(p[e])p[e].push(t);else{var o,i;if(void 0!==n)for(var a=document.getElementsByTagName("script"),u=0;u<a.length;u++){var c=a[u];if(c.getAttribute("src")==e||c.getAttribute("data-webpack")==v+n){o=c;break}}o||(i=!0,(o=document.createElement("script")).charset="utf-8",o.timeout=120,E.nc&&o.setAttribute("nonce",E.nc),o.setAttribute("data-webpack",v+n),o.src=e),p[e]=[t];var l=function(t,n){o.onerror=o.onload=null,clearTimeout(f);var r=p[e];if(delete p[e],o.parentNode&&o.parentNode.removeChild(o),r&&r.forEach((function(e){return e(n)})),t)return t(n)},f=setTimeout(l.bind(null,void 0,{type:"timeout",target:o}),12e4);o.onerror=l.bind(null,o.onerror),o.onload=l.bind(null,o.onload),i&&document.head.appendChild(o)}},E.r=function(e){"undefined"!=typeof Symbol&&Symbol.toStringTag&&Object.defineProperty(e,Symbol.toStringTag,{value:"Module"}),Object.defineProperty(e,"__esModule",{value:!0})},E.p="https://deo.shopeemobile.com/shopee/shopee-pcmall-live-sg/",y=function(e){return new Promise((function(t,n){var r=E.miniCssF(e),o=E.p+r;if(function(e,t){for(var n=document.getElementsByTagName("link"),r=0;r<n.length;r++){var o=(a=n[r]).getAttribute("data-href")||a.getAttribute("href");if("stylesheet"===a.rel&&(o===e||o===t))return a}var i=document.getElementsByTagName("style");for(r=0;r<i.length;r++){var a;if((o=(a=i[r]).getAttribute("data-href"))===e||o===t)return a}}(r,o))return t();!function(e,t,n,r){var o=document.createElement("link");o.rel="stylesheet",o.type="text/css",o.onerror=o.onload=function(i){if(o.onerror=o.onload=null,"load"===i.type)n();else{var a=i&&("load"===i.type?"missing":i.type),u=i&&i.target&&i.target.href||t,c=new Error("Loading CSS chunk "+e+" failed.\n("+u+")");c.code="CSS_CHUNK_LOAD_FAILED",c.type=a,c.request=u,o.parentNode.removeChild(o),r(c)}},o.href=t,document.head.appendChild(o)}(e,o,t,n)}))},g={589:0},E.f.miniCss=function(e,t){g[e]?t.push(g[e]):0!==g[e]&&{176:1,268:1,340:1,341:1,557:1,710:1,843:1}[e]&&t.push(g[e]=y(e).then((function(){g[e]=0}),(function(t){throw delete g[e],t})))},function(){var e={589:0};E.f.j=function(t,n){var r=E.o(e,t)?e[t]:void 0;if(0!==r)if(r)n.push(r[2]);else{var o=new Promise((function(n,o){r=e[t]=[n,o]}));n.push(r[2]=o);var i=E.p+E.u(t),a=new Error;E.l(i,(function(n){if(E.o(e,t)&&(0!==(r=e[t])&&(e[t]=void 0),r)){var o=n&&("load"===n.type?"missing":n.type),i=n&&n.target&&n.target.src;a.message="Loading chunk "+t+" failed.\n("+o+": "+i+")",a.name="ChunkLoadError",a.type=o,a.request=i,r[1](a)}}),"chunk-"+t,t)}};var t=function(t,n){for(var r,o,i=n[0],a=n[1],u=n[2],c=0,l=[];c<i.length;c++)o=i[c],E.o(e,o)&&e[o]&&l.push(e[o][0]),e[o]=0;for(r in a)E.o(a,r)&&(E.m[r]=a[r]);for(u&&u(E),t&&t(n);l.length;)l.shift()()},n=self.wpJsonpPcmallBundledeal=self.wpJsonpPcmallBundledeal||[];n.forEach(t.bind(null,0)),n.push=t.bind(null,n.push.bind(n))}(),E(117)}(),"Z"]},1]),function(){if(window&&window.__DECKER_HOOK__){var e=window.__DECKER_HOOK__;function t(){e.sendToDevtools("MFE_LOAD_SLOT",{slotName:"pcmall-bundledeal",tag:"pc-bundledeal-v0.10.0",branch:"heads/pc-bundledeal-v0.10.0",lastCommit:"chore(release): pc-bundledeal-v0.10.0",lastCommitHash:"82dcea6c6463f1a61361f4b7770e53648724f360",updated:"2022-11-23T07:06:01.122Z"})}e.on("MFE_RETRIEVE_SLOTS",t),t()}}();