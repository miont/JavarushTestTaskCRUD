/**
 * Скрипты javascript
 */

function makeSearchUserRequest(ev, elem) {

    var key = ev.charCode ? ev.charCode : ev.keyCode ? ev.keyCode : 0;
    if(key === 13) {
        window.location.href = elem.value ? '/?userName='+elem.value : '/';
    }
}

// https://stackoverflow.com/questions/901115/how-can-i-get-query-string-values-in-javascript
function getParameterByName(name, url) {
    if (!url) url = window.location.href;
    name = name.replace(/[\[\]]/g, "\\$&");
    var regex = new RegExp("[?&]" + name + "(=([^&#]*)|&|#|$)"),
        results = regex.exec(url);
    if (!results) return null;
    if (!results[2]) return '';
    return decodeURIComponent(results[2].replace(/\+/g, " "));
}