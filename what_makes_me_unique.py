
#job: https://jobs.lever.co/rover/bb4dcaeb-b5a9-4332-9c24-e86dc83dcaa3/apply?lever-source=LinkedIn

OTHER_PEOPLE = {} #dictionary representing the greater human population of the planet Earth

#Don't objectify me!
class AnActualPerson(object):
    #I suppose these are the only qualities of a person anyone cares about
    def __init__(self, cool=True, smart=True, handsome=True, awesome=True):
        self.cool = cool
        self.smart = smart
        self.handsome = handsome
        self.awesome = awesome

        #What
    def amIcool(self):
        if self.cool == True:
            return "Hell Yeah I'm cool...obviously"
        else:
            return "Actually I think honesty, hardwork, and desire to learn are what matters, I'm sorry that's not cool"
        #I
    def isThisGuySmart(self):
        if self.smart == True:
            return "I'm so smart applying to a dog walking app -- when I don't even own a dog..."
        else:
            return "I believe that all humans are intelligent, and its not about how you did in school."
        #really
    def iThinkWeKnowTheAnswerToThisQuestion(self):
        if self.handsome == True:
            return "Very Handsome"
        else:
            return "If looks are what matters to you -- then I feel sorry for you."
        #Think
    def canYouBelieveThisGuy(self):
        if self.awesome == True:
            return "Chuck Norris, Unicorns, and Lazer Beam Explosions!!!!"
        else:
            return "Sorry, but I'm just as cool or awesome as most normal people in this world"


if __name__ == '__main__':
    '''Initialize myself.'''
    David = AnActualPerson(True, True, True, False)

    '''Give myself parameters.'''
    david_params = []
    david_params.append(David.amIcool())
    david_params.append(David.isThisGuySmart())
    david_params.append(David.iThinkWeKnowTheAnswerToThisQuestion())
    david_params.append(David.canYouBelieveThisGuy())

    for param in david_params:
        print(param)
    