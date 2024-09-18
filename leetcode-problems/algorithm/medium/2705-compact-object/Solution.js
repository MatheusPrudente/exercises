/**
 * @param {Object|Array} obj
 * @return {Object|Array}
 */

var compactObject = function (obj) {
    let compact;

    if (isArray(obj)) {
        compact = [];
        for (const element of obj) {
            if (isArray(element) || isObject(element)) {
                compact.push(compactObject(element));
            } else {
                if (Boolean(element)) {
                    compact.push(element);
                }
            }
        }
    } else {
        compact = {};
        for (const key in obj) {
            if (isArray(obj[key]) || isObject(obj[key])) {
                compact[key] = compactObject(obj[key]);
            } else {
                if (Boolean(obj[key])) {
                    compact[key] = obj[key];
                }
            }
        }
    }

    return compact;
};

function isObject(value) {
    return Object.prototype.toString.call(value) === "[object Object]";
}

function isArray(value) {
    return Array.isArray(value);
}
