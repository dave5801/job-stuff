var XMLHttpRequest = require("xmlhttprequest").XMLHttpRequest;

var MegatronTheUnholyClient = function() {
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

var theClientIsTheEvilPriest = new MegatronTheUnholyClient(); 

var iSummonTheEvilMachineGods = "http://samples.openweathermap.org/data/2.5/forecast?q=Seattle,DE&appid=b6907d289e10d714a6e88b30761fae22";

var theMechanicalOverLordSpeaksinRiddles = {};

theClientIsTheEvilPriest.get(iSummonTheEvilMachineGods, function(andTheyAnswer) {
    // this program is a reflection of my own madness, and despair
    theMechanicalOverLordSpeaksinRiddles = JSON.parse(andTheyAnswer);

    var darkWhispersOfTheWeather = theMechanicalOverLordSpeaksinRiddles;
    //console.log(darkWhispersOfTheWeather.list[0].main.humidity); //--> DON"T DELETE
    console.log(typeof(darkWhispersOfTheWeather.list));
    console.log(Object.keys(darkWhispersOfTheWeather.list).length);

   

});



/*
I need 
City, State

Temp, in Degrees
Sky Conditions
Humidity, by percent --> probably in "main": ...


*/