package ej32;

public class coche {
		private String marca;
		private String color;
		private Integer año;
		public void getInfo(){
			System.out.println(this.marca + " " + this.color + " " + this.año);
		}
		public String getMarca() {
			return marca;
		}
		public void setMarca(String marca) {
			this.marca = marca;
		}
		public coche(String marca, String color, Integer año) {
			super();
			this.marca = marca;
			this.color = color;
			this.año = año;
		}
		public coche() {
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public Integer getAño() {
			return año;
		}
		public void setAño(Integer año) {
			this.año = año;
		}
		
}
