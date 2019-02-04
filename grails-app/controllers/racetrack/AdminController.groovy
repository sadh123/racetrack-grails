package racetrack

class AdminController {

    def beforeInterceptor = [action: this.&auth]


    def auth() {
        if (!session.user) {
            flash.message =
                    redirect(controller: "user", action: "login")
            return false
        }
        if (!session.user.admin) {
            flash.message = "tsk tsk-admins only"
            redirect(controller: "race", action: "index")
            return false
        }
    }
    def index = {}
}