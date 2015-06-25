package hqlerror;

public enum Role {

    ADMIN(0), MANAGER(1), BASIC(2);
    private long id;

    Role(long id){
        this.id = id;
    }

    public static final Role values[] = values();

    public long getId(){
        return this.id;
    }

    public static Role get(Long id) {
        if(id == null){
            return null;
        }
        return Role.values[id.intValue()];
    }
}
