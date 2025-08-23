String[] IMPERIAL_UNITS = new String[3];
IMPERIAL_UNITS[0] = "ft";
IMPERIAL_UNITS[1] = "lb";
IMPERIAL_UNITS[2] = "f";
IMPERIAL_UNITS;
String[] SI_UNITS = {"s","m","kg","A","K","mol","cd"};
final double ft2m = 0.3048;
final double lb2kg = 0.4536;
notes;
units
String n1 = "Is it hot?", n2 = "Is it cold?", n3 = "Is it heavy?", n4 = "Is it long?";
String n1 = "Is it hot?", n2 = "Is it cold?", n3 = "Is it heavy?", n4 = "Is it long?";
String n1 = "Is it hot?", n2 = "Is it cold?", n3 = "Is it heavy?", n4 = "Is it long?";
String n1 = "Is it hot?", n2 = "Is it cold?", n3 = "Is it heavy?", n4 = "Is it long?";
String[] notes = {n1,n2,n3,n4};
var values = new double[]{-43.23,142.7,12.52,36.9};
String[] units = {IMPERIAL_UNITS[2],SI_UNITS[4],IMPERIAL_UNITS[1],IMPERIAL_UNITS[0]};
for (int i = 0; i < values.length; i++) {
    String unit = units[i];
    for (String u : IMPERIAL_UNITS) {
        if (u.equals(unit)) {
            switch(unit) {
                case "ft":
                    values[i] = values[i] * ft2m;
                    units[i] = SI_UNITS[1];
                    break;
                case "lb":
                    values[i] = values[i] * lb2kg;
                    units[i] = SI_UNITS[2];
                    break;
                case "f":
                    values[i] = (values[i] - 32) * 5 / 9 + 273.15;
                    units[i] = SI_UNITS[4];
            }
		break;
        }
    }
}
values