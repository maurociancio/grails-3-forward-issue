package test

class UrlMappings {

    static mappings = {
        name testMapping: '/test-mapping'(controller: 'test') {
          action = [GET: 'get', POST: 'post']
        }

        /*
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }*/

        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
