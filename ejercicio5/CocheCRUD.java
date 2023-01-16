package com.ejercicios.ejercicio5;

public interface CocheCRUD {
    void save();
    void findAll();
    void delete();
}
 class  CocheCRUDImpl implements CocheCRUD {

    String save = "Guardar Coche";
    String FindAll = "Buscar Coche";
    String delete = "Borrar Coche";

     public void save() {
     }
     public void findAll() {
     }
     public void delete() {
     }

    @Override
    public String toString() {
        return "CocheCRUDImpl{" +
                "save='" + save + '\'' +
                ", FindAll='" + FindAll + '\'' +
                ", delete='" + delete + '\'' +
                '}';
    }
}