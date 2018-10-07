package test

class TestController {

    def get() {
    }

    def post() {
      forward action: 'get'
    }
}
