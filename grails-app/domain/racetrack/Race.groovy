package racetrack

class Race {
    String name
    Date startDate
    String state
    String city
    BigDecimal distance

    BigDecimal inMiles(){
        return distance*0.6214
    }
    BigDecimal cost
    int  maximumRunners


    static constraints = {
        name(blank: false, maxSize:50)
        startDate( validator: {return  (it>new Date())})
        city()
        state(inList:["GA", "NC", "SC", "VA"])
        distance(min:0.0)
        cost(min:0.0, max:100.0)
        maximumRunners(min:0, max:100000)
    }

//    static  mapping = {
//        sort("startDate")
//    }
    static  hasMany = [registration:Registration]

     String toString(){
        "${name}, ${startDate}"
    }
}
