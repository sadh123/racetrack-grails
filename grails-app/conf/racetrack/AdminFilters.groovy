package racetrack

class AdminFilters {

    def filters = {
        adminOnly(controller: '*', action: 'create|update|delete|save') {
            before = {
                if (session.user.toString() != 'admin') {
                    flash.message = "sorry,admin only"
                    redirect(controller: "race", action: "index")
                    return false
                }
            }

        }
    }
}
