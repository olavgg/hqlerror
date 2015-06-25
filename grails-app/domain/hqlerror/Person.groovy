package hqlerror

import grails.compiler.GrailsCompileStatic

@GrailsCompileStatic
class Person {
    String username
    String password
    String email
    String fullName
    String description
    Role role

    Date dateCreated
    Date lastUpdated

    Boolean deactivated = false

    static constraints = {
        username blank: false, nullable: false, unique: true
        password blank: false, nullable: false
        email email: true, unique: true
        fullName blank:false, nullable: false
        description nullable: true, blank: true
        role nullable: false
        deactivated nullable: false
    }

    static mapping = {
        version false
        //id generator:'sequence', params:[sequence:'person_seq']
        id index:'person_id_idx'
        email index:'person_email_idx'
        role enumType:"ordinal"
        role index: 'person_role_id_idx'
        deactivated index: 'person_deactivated_idx'
    }

    def beforeInsert() {
        encodePassword()
    }

    def beforeUpdate(){
        if(isDirty('password')){
            encodePassword()
        }
    }

    protected void encodePassword() {
        //this.password = PasswordManager.encode(this.password)
    }

    boolean validatePassword(String password) {
        //if(PasswordManager.validate(password, this.password)){
        //    return true
        //}
        false
    }
}
