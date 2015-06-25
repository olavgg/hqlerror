package hqlerror

class PersonController {

    def index() { 
        println Person.findAllByDeactivatedAndRole(false, Role.BASIC)
        println Person.findAllByDeactivatedAndRoleInList(
            false, [Role.BASIC, Role.MANAGER]
        )
        println Person.findAll("""
            FROM Person p
            WHERE p.deactivated = false
            AND p.role = :role
        """,
                [role: Role.BASIC]
        )
        println Person.findAll("""
            FROM Person p
            WHERE p.deactivated = false
            AND p.role = :roles
        """,
                [role: [Role.BASIC, Role.MANAGER]]
        )
        render "success!"
    }
}
