package helloworld

class HelloWorldController {

  def index() {
    render "Hello World!! " + params.name
  }
}
