function onSubmit() {
    var xhttp = new XMLHttpRequest();
    xhttp.open("POST", "/getRoleBasedOnUserId/1", true);
    xhttp.setRequestHeader("Content-type", "application/xml");
    xhttp.send();
    var response = JSON.parse(xhttp.responseText);
    a
}