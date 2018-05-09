function mysteriousWeatherSummons(){
    var XMLHttpRequest = require("xmlhttprequest").XMLHttpRequest;

    var clientOfYogSothoth = function() {
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

    var charlesDexterWard = new clientOfYogSothoth(); 

    var iSummonTheEvilMachineGods = "http://samples.openweathermap.org/data/2.5/forecast?q=Seattle,DE&appid=b6907d289e10d714a6e88b30761fae22";
    var theMechanicalOverLordSpeaksinRiddles = {};

    charlesDexterWard.get(iSummonTheEvilMachineGods, function(andTheyAnswer) {
        // this program is a reflection of my own madness, and despair
        theMechanicalOverLordSpeaksinRiddles = JSON.parse(andTheyAnswer);

        var darkWhispersOfTheWeather = theMechanicalOverLordSpeaksinRiddles;
        
        //console.log(darkWhispersOfTheWeather.list[0].main.humidity); //--> DON"T DELETE
       // console.log(Object.keys(darkWhispersOfTheWeather.list).length);
        var daysOfTheDarkWeather = Object.keys(darkWhispersOfTheWeather.list).length;

        for(var unholy_index = 0; unholy_index < daysOfTheDarkWeather; unholy_index+=7){
            console.log("high: " +darkWhispersOfTheWeather.list[unholy_index].main.temp);
            console.log("low: " +darkWhispersOfTheWeather.list[unholy_index].main.temp_min);
            console.log("humidity: " +darkWhispersOfTheWeather.list[unholy_index].main.humidity);
        }

       

    });

}

function daysAreNumbered(justAnAverageDay){
    dayOfTheDead = {
        0: "Sunday",
        1:"Monday", 
        2: "Tuesday", 
        3: "Wednesday", 
        4: "Thursday", 
        5: "Friday", 
        6: "Saturday"
        }

        return dayOfTheDead[justAnAverageDay]
}

function seeTheFuture(changeInTimeDimension) {
    var fragmentsOfTime = [];

    for (var timeTraveled = 0; timeTraveled <= 5; timeTraveled++) {
        var aFrameOfReference = new Date();
        aFrameOfReference.setDate(changeInTimeDimension.getDate() + timeTraveled);
        fragmentsOfTime.push(daysAreNumbered(aFrameOfReference.getDay()));
    }

    return fragmentsOfTime;
}

//mysteriousWeatherSummons();
var tmp = seeTheFuture(new Date());
console.log(tmp);


/*
I need 
City, State

Temp, in Degrees
Sky Conditions
Humidity, by percent --> probably in "main": ...


*/