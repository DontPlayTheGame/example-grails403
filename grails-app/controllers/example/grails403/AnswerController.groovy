package example.grails403

class AnswerController {
    def index() { }

    def doSomething() {
        flash.message = message(code: "question.mymessage", default: "Job done")
        redirect(controller: "home")
    }
}
