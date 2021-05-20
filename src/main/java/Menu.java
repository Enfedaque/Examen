public class Menu {
    private String menudelDia;
    private String menuFinDeSemana;

    public Menu(String menudelDia, String menuFinDeSemana) {
        this.menudelDia = menudelDia;
        this.menuFinDeSemana = menuFinDeSemana;
    }

    public String getMenudelDia() {
        return menudelDia;
    }

    public void setMenudelDia(String menudelDia) {
        this.menudelDia = menudelDia;
    }

    public String getMenuFinDeSemana() {
        return menuFinDeSemana;
    }

    public void setMenuFinDeSemana(String menuFinDeSemana) {
        this.menuFinDeSemana = menuFinDeSemana;
    }
}
