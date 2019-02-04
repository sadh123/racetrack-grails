class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }
        "/"(controller: "race",action: "index")
        "/admin"(view:"/index")
        "500"(view:'/error')
	}
}
