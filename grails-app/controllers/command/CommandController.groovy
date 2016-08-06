package command

class CommandController {

    def index() {
        render {
            ul {
               li {
                    a(href:"/command/command1", "SearchCommand without Validateable trait")
               }
               li {
                    a(href:"/command/command2", "SearchCommand with Validateable trait")
               }
            }

        }
    }

    def command1(SearchCommand1 c) {
        render c.errors; 
    }

    def command2(SearchCommand2 c) {
        render c.errors; 
    }
}


class SearchCommand1 {

    static boolean defaultNullable() {
        true
    }

    String lastName;
    String firstName;

}

class SearchCommand2 implements grails.validation.Validateable {

    static boolean defaultNullable() {
        true
    }

    String lastName;
    String firstName;

}
