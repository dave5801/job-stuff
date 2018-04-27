(function() {

    let reasons = {
                    1: "a wizard told me",
                    2: "an employee referred me, at least the way I remember it...",
                    3: "a generic job posting",
                    4: "a job posting with better font",
                    5: "I stay often Airbinb"
                    }
    
    function HowIlearnedaboutThisJobMachineFactoryThing(){
      this.count = 0;

      setInterval(() => {
        this.count++; // |this| properly refers to the person object
        
        let rando = Math.random() * (6 - 1) + 1;
        Math.floor(rando)
        console.log("hello again " +Math.floor(rando));

      }, 1000);
    }

    var stuff = new HowIlearnedaboutThisJobMachineFactoryThing();

}());
