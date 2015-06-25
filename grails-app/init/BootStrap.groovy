import hqlerror.*

class BootStrap {

    def init = { servletContext ->
        new Person(
                username: 'olav',
                password: 'testing',
                email: 'olav@example.com',
                fullName: 'Olav Grønås Gjerde',
                description: "Bug hunter",
                role: Role.BASIC
        ).save()
        new Person(
                username: 'olav2',
                password: 'testing',
                email: 'olav2@example.com',
                fullName: 'Olav Grønås Gjerde2',
                description: "Bug hunter",
                role: Role.BASIC
        ).save()
        new Person(
                username: 'olav3',
                password: 'testing',
                email: 'olav3@example.com',
                fullName: 'Olav Grønås Gjerde2',
                description: "Bug hunter",
                role: Role.MANAGER
        ).save()
        new Person(
                username: 'admin',
                password: 'testing',
                email: 'admin@example.com',
                fullName: 'Admin',
                description: "Bug Admin",
                role: Role.ADMIN
        ).save()
    }
    def destroy = {
    }
}
