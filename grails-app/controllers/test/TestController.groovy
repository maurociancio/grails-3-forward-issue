package test

class TestController {

    def get() {
      [params: params, model: request.algo]
    }

    def post() {
      forward action: 'get', model: [algo: true]
    }
}
