package Cuentas;
public class Main {

    public static class Cantidad {
		public float[] args;

		public Cantidad(float[] args) {
			this.args = args;
		}
	}

	public static void main(Cantidad parameterObject) {
        operativa_cuenta();
    }

	private static void operativa_cuenta() {
		CCuenta cuenta1;
        double saldoActual;
        int cantidadTotal=5000;
        int creditoSolicitado=30000;
        
        if (cantidadTotal>= 1000) {
        	System.out.println("Saldo insuficiente");
        }

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar saldo");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
	}
}
