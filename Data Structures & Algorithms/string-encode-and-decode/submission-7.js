class Solution {
    /**
     * @param {string[]} strs
     * @returns {string}
     */
    encode(strs) {
        let lengths =[];
        for(let str of strs) {
            lengths.push(str.length);
        }
        let len = strs.length;
        return len +","+ lengths.toString() +",h"+ strs.toString();
    }

    /**
     * @param {string} str
     * @returns {string[]}
     */
    decode(str) {
        console.log(str);
        let manipulate = str.split(",");
        let n = manipulate[0];
        let start= str.indexOf("h")+1;
        let words = [];
        console.log(manipulate);
        for(let i=1; i<=n; i++){
            words.push(str.slice(start, Number(manipulate[i])+start));
            start+= Number(manipulate[i])+1;
        }
        return words;
    }
}
