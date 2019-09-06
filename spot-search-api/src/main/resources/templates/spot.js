function search_result(){
    if (userId === '0' || userId === null) {
        //  block of code to be executed if the condition is true
        window.location.replace("http://localhost:8083/search?keyWord=" + spotName);
    } else {
        //  block of code to be executed if the condition is false
        window.location.replace("http://localhost:8083/search?keyWord=" + apotName + "&userId=" + userId);
    }

}
