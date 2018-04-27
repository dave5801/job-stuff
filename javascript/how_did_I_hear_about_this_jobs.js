(function() {
    //key, value pairing of ways I could have learned about opportunties at Airbnb
    let ways_i_hear_about_this_job = {
                    1: "a wizard told me...",
                    2: "an employee referred me, at least the way I remember it...yeah, we're cool",
                    3: "a generic job posting",
                    4: "a job posting with even better font",
                    5: "I stay often at Airbinb",
                    6: "from a time traveller from the future...!",
                    7: "a giant talking lizard",
                    8: "Aliens!",
                    9: "I had a telepathic vision of the Earth millions of years from now",
                    10: "I swore to my grandfather, on his deathbead, that I would one day...I would work for Airbnb."
                    }
    //do stuff
    function HowIlearnedaboutThisJobMachineFactoryThing(){

      console.log("Good Question: How did I hear about this job?\n");

      this.count = 0;

      //set a time interval for stuff that needs doing
      setInterval(() => {//awesome use of arrow functions, btw
        this.count++; 
        
        //get a random key from the object above
        let rando = Math.random() * (11 - 1) + 1;
        console.log("...so how did I hear about this job? " 
            +ways_i_hear_about_this_job[Math.floor(rando)] + "\n");

      }, 2000);
    }

    //do the stuff with the thing
    var stuff = new HowIlearnedaboutThisJobMachineFactoryThing();

}());
