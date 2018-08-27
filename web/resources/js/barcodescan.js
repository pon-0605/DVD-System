var words = '';
var scanning = false;
$(document).keypress(function(e) {
  if (e.charCode === 13) {
    if (scanning) {
      console.log(words);
      words = '';
      scanning = false;
    } else {
      scanning = true;
    }
    return false;
  }
  if (scanning) {
    var key = String.fromCharCode(e.charCode);
    words = words + key;
    var o_code=words;
    o_code.substring(6,-1);
  }
});
