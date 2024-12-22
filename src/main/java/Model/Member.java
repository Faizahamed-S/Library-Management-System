package Model;

import java.time.LocalDate;

public class Member {
    private int id;
    private String name;
    private LocalDate membershipDate;

    public Member(int id, String name, LocalDate membershipDate) {
    this.id = id;
    this.name = name;
    this.membershipDate = membershipDate;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public LocalDate getMembershipDate() {
        return membershipDate;
    }
    public void setMembershipDate(LocalDate membershipDate) {
        this.membershipDate = membershipDate;
    }
    @Override
    public String toString() {
        return "Member [id=" + id + ", name=" + name + ", membershipDate=" + membershipDate + "]";
    }
}
