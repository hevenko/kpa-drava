package test.hevenko;

import javax.persistence.Column;
import javax.persistence.Id;

public class TestRow {
    @Id
    @Column(name = "id")
    long id;

    TestRow(long id, String naziv) {
        this.id = id;
        this.naziv = naziv;
    }

    @Column(name = "naziv")
    String naziv;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }
}
