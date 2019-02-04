import com.sun.java.util.jar.pack.Instruction
import racetrack.Race
import racetrack.Registration
import racetrack.Runner
import grails.util.GrailsUtil
import racetrack.User

class BootStrap {

    def init = { servletContext ->
        switch (GrailsUtil.environment) {
            case "development":

                def admin =new User(login:"admin",
                password: "wordpass",
                role: "admin")
                admin.save()
                if(admin.hasErrors()){
                    println(admin.errors)
                }

                def jdoe =new User(login:"jdoe",
                        password: "password",
                        role: "user")
                jdoe.save()
                if(jdoe.hasErrors()){
                    println(jdoe.errors)
                }

                def jane = new Runner(firstName: "Jane",
                        lastName: "Doe",
                        dateOfBirth: (new Date() - 365 * 30),
                        gender: "F",
                        address: "123 Main St",
                        city: "Goose",
                        state: "NC",
                        zipcode: "12345",
                        email: "jane@whereever.com"
                )
                jane.save()
                if (jane.hasErrors()) {
                    println(jane.errors)
                }

                def trat = new Race(
                        name: "ram",
                        startDate: (new Date() + 1),
                        city: "arab",
                        state: "GA",
                        distance: 10.0,
                        cost: 50.0,
                        maximumRunners: 10.0
                )
                trat.save()
                if (trat.hasErrors()) {
                    println(trat.errors())
                }

                def reg = new Registration(

                        paid: false,
                        runner: jane,
                        race: trat

                )
                reg.save()
                if (reg.hasErrors()) {
                    println(reg.errors())
                }
                def burner = new Race(
                        name:"Barn Burner",
                        startDate:(new Date() + 120),
                        city:"Cary",
                        state:"NC",
                        distance:10.0,
                        cost:15.0,
                        maxRunners:350
                )
                burner.save()
                if(burner.hasErrors()){
                    println burner.errors
                }
                def chase = new Race(
                        name:"Race for the Chase",
                        startDate:(new Date() + 150),
                        city:"Duck",
                        state:"NC",
                        distance:5.0,
                        cost:25.0,
                        maxRunners:350
                )
                chase.save()
                if(chase.hasErrors()){
                    println chase.errors
                }
                break
            case "production":
                break
        }

    }
    def destroy = {
    }
}
