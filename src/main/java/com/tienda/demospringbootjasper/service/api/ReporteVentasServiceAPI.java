package com.tienda.demospringbootjasper.service.api;

import com.tienda.demospringbootjasper.model.ReporteVentasDTO;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Map;
import net.sf.jasperreports.engine.JRException;

   public interface ReporteVentasServiceAPI {
    ReporteVentasDTO obtenerReporteVentas(Map<String, Object> params)throws JRException, IOException, SQLException;
}
