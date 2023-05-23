package com.bancolombia.calidad.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class UserPage extends PageObject {

    public static final Target OPCION_CREDITOS = Target.the("VER CREDITOS").locatedBy("/html/body/div[2]/div[2]/div/div[2]/div/div[7]/section/div[3]/section/div/div[2]/div[1]/div/div[2]/span/a");
    public static final Target CERRAR_POPUP = Target.the("CERRAR POPUP").locatedBy("/html/body/div[2]/div[2]/div/div[2]/div/div[9]/section/div[3]/div[2]/section/div/div[1]/button");
    public static final Target OPCION_IR_SIMULAR = Target.the("OPCION IR SIMULAR").locatedBy("/html/body/div[2]/div[2]/div/div[2]/div/div[6]/section/div[3]/section/div/div[1]/div[4]/div/div[2]/div/a[1]");
    public static final Target OPCION_CONTINUAR = Target.the("OPCION CONTINUAR").located(By.id("boton-seleccion-tarjeta"));
    public static final Target OPCION_SI = Target.the("OPCION SI").locatedBy("/html/body/div[2]/div[2]/div/div[2]/div/div[2]/section/div[3]/div[2]/app-root/div/app-solicitud-monto/section/form/mat-radio-group/mat-radio-button[1]");
    public static final Target INPUT_MONTO = Target.the("INPUT MONTO").located(By.id("valor-simulacion"));
    public static final Target INPUT_CUOTAS = Target.the("INPUT CUOTAS").located(By.id("valor-plazo"));
    public static final Target OPCION_FECHA = Target.the("OPCION FECHA").located(By.id("campo-fecha"));
    public static final Target OPCION_YEAR = Target.the("OPCION YEAR").locatedBy("/html/body/div[6]/div[2]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-multi-year-view/table/tbody/tr[5]/td[3]/div[1]");
    public static final Target OPCION_MONTH = Target.the("OPCION MONTH").locatedBy("/html/body/div[6]/div[2]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-year-view/table/tbody/tr[2]/td[3]/div[1]");
    public static final Target OPCION_DAY = Target.the("OPCION DAY").locatedBy("/html/body/div[6]/div[2]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-month-view/table/tbody/tr[5]/td[3]/div[1]");
    public static final Target OPCION_SIMULAR = Target.the("OPCION SIMULAR").located(By.id("boton-simular"));
    public static final Target TEXTO_VALIDACION = Target.the("TEXTO VALIDACION").locatedBy("/html/body/div[2]/div[2]/div/div[2]/div/div[2]/section/div[3]/div[2]/app-root/div/app-resultado-simulacion/section[1]/swiper/div/div[1]/div[2]/div/div[3]/small");
}
