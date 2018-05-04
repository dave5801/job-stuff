var XMLHttpRequest = require("xmlhttprequest").XMLHttpRequest;

var HttpClient = function() {
    this.get = function(theUnspeakableUrl, aCallback) {
        var sacrificialHttpRequest = new XMLHttpRequest();
        sacrificialHttpRequest.onreadystatechange = function() { 
            if (sacrificialHttpRequest.readyState == 4 && sacrificialHttpRequest.status == 200)
                aCallback(sacrificialHttpRequest.responseText);
        }

        sacrificialHttpRequest.open( "GET", theUnspeakableUrl, true );            
        sacrificialHttpRequest.send( null );
    }
}

var theClientIsTheEvilPriest = new HttpClient(); 

var iSummonTheEvilMachineGods = "http://samples.openweathermap.org/data/2.5/forecast?q=Seattle,DE&appid=b6907d289e10d714a6e88b30761fae22";

theClientIsTheEvilPriest.get(iSummonTheEvilMachineGods, function(andTheyAnswer) {
    // this program is a reflection of my own madness, and despair
    var soTheMechanicalOverLordSpeaks = andTheyAnswer;

    console.log(soTheMechanicalOverLordSpeaks);
});