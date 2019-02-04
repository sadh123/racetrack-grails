package racetrack

class FooterTagLib {
   def thisYear={
       out << new Date().format('yyyy')
   }
    def copyright ={attr,body ->
        out << "&copy"+ attr.startYear + "-"
        out << thisYear() + " " +body()
    }
}
