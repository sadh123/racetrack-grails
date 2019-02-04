package racetrack

class Registration {

    static constraints = {
        race()
      runner()
        paid()
        dateCreated()

    }

    static  belongsTo = [race:Race,runner:Runner]
    boolean  paid
    Date dateCreated
}
