/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.importnfe.util;

import br.com.swconsultoria.nfe.schema_4.consReciNFe.TNfeProc;
import com.importnfe.model.Nfe;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;

/**
 *
 * @author daniel
 */
public class Util {

    public static final String ID = "id";
    public static final String CHNFE = "chNFe";
    public static final String NATOP = "natOp";
    public static final String MOD = "mod";
    public static final String SERIE = "serie";
    public static final String NNF = "nNF";
    public static final String DHEMI = "dhEmi";
    public static final String TPNF = "tpNF";
    public static final String EMITCNPJ = "emitCnpj";
    public static final String EMITIE = "emitIe";
    public static final String EMITUF = "emitUf";
    public static final String EMITNOME = "emitNome";
    public static final String EMITFANT = "emitFant";
    public static final String DESTCNPJ = "destCnpj";
    public static final String DESTCPF = "destCpf";
    public static final String DESTIE = "destIe";
    public static final String DESTISUF = "destIsuf";
    public static final String DESTUF = "destUf";
    public static final String DESTNOME = "destNome";
    public static final String VNF = "vNF";
    public static final String VBC = "vBC";
    public static final String VICMS = "vICMS";
    public static final String VICMSDESON = "vICMSDeson";
    public static final String VBCST = "vBCST";
    public static final String VPROD = "vProd";
    public static final String VFRETE = "vFrete";
    public static final String VSEG = "vSeg";
    public static final String VDESC = "vDesc";
    public static final String VII = "vII";
    public static final String VIPI = "vIPI";
    public static final String VPIS = "vPIS";
    public static final String VCOFINS = "vCOFINS";
    public static final String VOUTRO = "vOutro";
    public static final String VTOTRIB = "vTotTrib";
    public static final String NFAT = "nFat";
    public static final String VORIG = "vOrig";
    public static final String VDESCFAT = "vDescFat";
    public static final String VLIQ = "vLiq";
    public static final String NDUP = "nDup";
    public static final String DVENC = "dVenc";
    public static final String VDUP = "vDup";
    public static final String CREATEAT = "createat";
    
    public static final String SQL_NOTAFISCAL = "SELECT * FROM notafiscal;"; 

    public static String readFile(String path, Charset encoding) throws IOException {
        byte[] encoded = Files.readAllBytes(Paths.get(path));
        return new String(encoded, encoding);
    }

    public static Nfe montaObjeto(TNfeProc tNfe) {
        Nfe nfe = new Nfe();
        nfe.setChNFe(tNfe.getNFe().getInfNFe().getId().contains("NFe") ? tNfe.getNFe().getInfNFe().getId().replace("NFe", "") : tNfe.getNFe().getInfNFe().getId());
        nfe.setNatOp(tNfe.getNFe().getInfNFe().getIde().getNatOp());
        nfe.setMod(Integer.parseInt(tNfe.getNFe().getInfNFe().getIde().getMod()));
        nfe.setSerie(Integer.parseInt(tNfe.getNFe().getInfNFe().getIde().getSerie()));
        nfe.setnNF(tNfe.getNFe().getInfNFe().getIde().getNNF());
        nfe.setDhEmi(returnDate(tNfe.getNFe().getInfNFe().getIde().getDhEmi()));
        nfe.setTpNF(Integer.parseInt(tNfe.getNFe().getInfNFe().getIde().getTpNF()));
        nfe.setEmitCnpj(tNfe.getNFe().getInfNFe().getEmit().getCNPJ());
        nfe.setEmitIe(tNfe.getNFe().getInfNFe().getEmit().getIE());
        nfe.setEmitNome(tNfe.getNFe().getInfNFe().getEmit().getXNome());
        nfe.setEmitFant(tNfe.getNFe().getInfNFe().getEmit().getXFant());
        nfe.setDestCnpj(tNfe.getNFe().getInfNFe().getDest().getCNPJ());
        nfe.setDestCpf(tNfe.getNFe().getInfNFe().getDest().getCPF());
        nfe.setDestIe(tNfe.getNFe().getInfNFe().getDest().getIE());
        nfe.setDestIsuf(tNfe.getNFe().getInfNFe().getDest().getISUF());
        nfe.setDestUf(tNfe.getNFe().getInfNFe().getDest().getEnderDest().getUF().name());
        nfe.setDestNome(tNfe.getNFe().getInfNFe().getDest().getXNome());
        nfe.setvNF(Double.parseDouble(tNfe.getNFe().getInfNFe().getTotal().getICMSTot().getVNF()));
        nfe.setvBC(Double.parseDouble(tNfe.getNFe().getInfNFe().getTotal().getICMSTot().getVBC()));
        nfe.setvICMS(Double.parseDouble(tNfe.getNFe().getInfNFe().getTotal().getICMSTot().getVICMS()));
        nfe.setvICMSDeson(Double.parseDouble(tNfe.getNFe().getInfNFe().getTotal().getICMSTot().getVICMSDeson()));
        nfe.setvBCST(Double.parseDouble(tNfe.getNFe().getInfNFe().getTotal().getICMSTot().getVBCST()));
        nfe.setvProd(Double.parseDouble(tNfe.getNFe().getInfNFe().getTotal().getICMSTot().getVProd()));
        nfe.setvFrete(Double.parseDouble(tNfe.getNFe().getInfNFe().getTotal().getICMSTot().getVFrete()));
        nfe.setvSeg(Double.parseDouble(tNfe.getNFe().getInfNFe().getTotal().getICMSTot().getVSeg()));
        nfe.setvDesc(Double.parseDouble(tNfe.getNFe().getInfNFe().getTotal().getICMSTot().getVDesc()));
        nfe.setvII(Double.parseDouble(tNfe.getNFe().getInfNFe().getTotal().getICMSTot().getVII()));
        nfe.setvIPI(Double.parseDouble(tNfe.getNFe().getInfNFe().getTotal().getICMSTot().getVIPI()));
        nfe.setvPIS(Double.parseDouble(tNfe.getNFe().getInfNFe().getTotal().getICMSTot().getVPIS()));
        nfe.setvCOFINS(Double.parseDouble(tNfe.getNFe().getInfNFe().getTotal().getICMSTot().getVCOFINS()));
        nfe.setvOutro(Double.parseDouble(tNfe.getNFe().getInfNFe().getTotal().getICMSTot().getVOutro()));
        nfe.setvProd(Double.parseDouble(tNfe.getNFe().getInfNFe().getTotal().getICMSTot().getVTotTrib()));
        nfe.setnFat(tNfe.getNFe().getInfNFe().getCobr() == null ? "-" : tNfe.getNFe().getInfNFe().getCobr().getFat().getNFat());
        nfe.setvOrig(tNfe.getNFe().getInfNFe().getCobr() == null ? 0.0 : Double.parseDouble(tNfe.getNFe().getInfNFe().getCobr().getFat().getVOrig()));
        nfe.setvLiq(tNfe.getNFe().getInfNFe().getCobr() == null ? 0.0 : Double.parseDouble(tNfe.getNFe().getInfNFe().getCobr().getFat().getVLiq()));
        nfe.setvDescFat(tNfe.getNFe().getInfNFe().getCobr() == null ? 0.0 : Double.parseDouble(tNfe.getNFe().getInfNFe().getCobr().getFat().getVDesc()));
        nfe.setnDup(tNfe.getNFe().getInfNFe().getCobr() == null ? "-" : String.valueOf(tNfe.getNFe().getInfNFe().getCobr().getDup().stream().findFirst().get().getNDup()));
        nfe.setdVenc(returnDateLocalDate(tNfe.getNFe().getInfNFe().getCobr() == null ? "2000-01-01" : tNfe.getNFe().getInfNFe().getCobr().getDup().stream().findFirst().get().getDVenc()));
        nfe.setvDup(tNfe.getNFe().getInfNFe().getCobr() == null ? 0.0 : Double.parseDouble(tNfe.getNFe().getInfNFe().getCobr().getDup().stream().findFirst().get().getVDup()));
        return nfe;
    }

    public static LocalDateTime returnDate(String data) {
        LocalDateTime result = LocalDateTime.parse(data, DateTimeFormatter.ISO_DATE_TIME);
        return result;
    }

    private static LocalDate returnDateLocalDate(String data) {
        LocalDate local = LocalDate.parse(data == null ? "0000-00-00" : data);
        return local;
    }
    
    public static void montaJTable(ModeloTabela modelo, JTable jTable1){
        jTable1.setModel(modelo);
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(75);
        jTable1.getColumnModel().getColumn(0).setResizable(false);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(370);
        jTable1.getColumnModel().getColumn(1).setResizable(false);
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(250);
        jTable1.getColumnModel().getColumn(2).setResizable(false);
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(170);
        jTable1.getColumnModel().getColumn(3).setResizable(false);
        jTable1.getColumnModel().getColumn(4).setPreferredWidth(170);
        jTable1.getColumnModel().getColumn(4).setResizable(false);
        jTable1.getColumnModel().getColumn(5).setPreferredWidth(170);
        jTable1.getColumnModel().getColumn(5).setResizable(false);
        jTable1.getColumnModel().getColumn(6).setPreferredWidth(170);
        jTable1.getColumnModel().getColumn(6).setResizable(false);
        jTable1.getColumnModel().getColumn(7).setPreferredWidth(145);
        jTable1.getColumnModel().getColumn(7).setResizable(false);
        jTable1.getColumnModel().getColumn(8).setPreferredWidth(145);
        jTable1.getColumnModel().getColumn(8).setResizable(false);
        jTable1.getColumnModel().getColumn(9).setPreferredWidth(145);
        jTable1.getColumnModel().getColumn(9).setResizable(false);
        jTable1.getColumnModel().getColumn(10).setPreferredWidth(145);
        jTable1.getColumnModel().getColumn(10).setResizable(false);
        jTable1.getColumnModel().getColumn(11).setPreferredWidth(145);
        jTable1.getColumnModel().getColumn(11).setResizable(false);
        jTable1.getColumnModel().getColumn(12).setPreferredWidth(145);
        jTable1.getColumnModel().getColumn(12).setResizable(false);
        jTable1.getColumnModel().getColumn(13).setPreferredWidth(145);
        jTable1.getColumnModel().getColumn(13).setResizable(false);
        jTable1.getColumnModel().getColumn(14).setPreferredWidth(145);
        jTable1.getColumnModel().getColumn(14).setResizable(false);
        jTable1.getColumnModel().getColumn(15).setPreferredWidth(145);
        jTable1.getColumnModel().getColumn(15).setResizable(false);
        jTable1.getColumnModel().getColumn(16).setPreferredWidth(145);
        jTable1.getColumnModel().getColumn(16).setResizable(false);
        jTable1.getColumnModel().getColumn(17).setPreferredWidth(145);
        jTable1.getColumnModel().getColumn(17).setResizable(false);
        jTable1.getColumnModel().getColumn(18).setPreferredWidth(145);
        jTable1.getColumnModel().getColumn(18).setResizable(false);
        jTable1.getColumnModel().getColumn(19).setPreferredWidth(145);
        jTable1.getColumnModel().getColumn(19).setResizable(false);
        jTable1.getColumnModel().getColumn(20).setPreferredWidth(145);
        jTable1.getColumnModel().getColumn(20).setResizable(false);
        jTable1.getColumnModel().getColumn(21).setPreferredWidth(145);
        jTable1.getColumnModel().getColumn(21).setResizable(false);
        jTable1.getColumnModel().getColumn(22).setPreferredWidth(145);
        jTable1.getColumnModel().getColumn(22).setResizable(false);
        jTable1.getColumnModel().getColumn(23).setPreferredWidth(145);
        jTable1.getColumnModel().getColumn(23).setResizable(false);
        jTable1.getColumnModel().getColumn(24).setPreferredWidth(145);
        jTable1.getColumnModel().getColumn(24).setResizable(false);
        jTable1.getColumnModel().getColumn(25).setPreferredWidth(145);
        jTable1.getColumnModel().getColumn(25).setResizable(false);        
        jTable1.getColumnModel().getColumn(26).setPreferredWidth(145);
        jTable1.getColumnModel().getColumn(26).setResizable(false);
        jTable1.getColumnModel().getColumn(27).setPreferredWidth(145);
        jTable1.getColumnModel().getColumn(27).setResizable(false);
        jTable1.getColumnModel().getColumn(28).setPreferredWidth(145);
        jTable1.getColumnModel().getColumn(28).setResizable(false);
        jTable1.getColumnModel().getColumn(29).setPreferredWidth(145);
        jTable1.getColumnModel().getColumn(29).setResizable(false);
        jTable1.getColumnModel().getColumn(30).setPreferredWidth(145);
        jTable1.getColumnModel().getColumn(30).setResizable(false);
        jTable1.getColumnModel().getColumn(31).setPreferredWidth(145);
        jTable1.getColumnModel().getColumn(31).setResizable(false);
        jTable1.getColumnModel().getColumn(32).setPreferredWidth(145);
        jTable1.getColumnModel().getColumn(32).setResizable(false);
        jTable1.getColumnModel().getColumn(33).setPreferredWidth(145);
        jTable1.getColumnModel().getColumn(33).setResizable(false);
        jTable1.getColumnModel().getColumn(34).setPreferredWidth(145);
        jTable1.getColumnModel().getColumn(34).setResizable(false);
        jTable1.getColumnModel().getColumn(35).setPreferredWidth(145);
        jTable1.getColumnModel().getColumn(35).setResizable(false);
        jTable1.getColumnModel().getColumn(36).setPreferredWidth(145);
        jTable1.getColumnModel().getColumn(36).setResizable(false);
        jTable1.getColumnModel().getColumn(37).setPreferredWidth(145);
        jTable1.getColumnModel().getColumn(37).setResizable(false);
        jTable1.getColumnModel().getColumn(38).setPreferredWidth(145);
        jTable1.getColumnModel().getColumn(38).setResizable(false);
        jTable1.getColumnModel().getColumn(39).setPreferredWidth(145);
        jTable1.getColumnModel().getColumn(39).setResizable(false);
        jTable1.getColumnModel().getColumn(40).setPreferredWidth(145);
        jTable1.getColumnModel().getColumn(40).setResizable(false);
        jTable1.getColumnModel().getColumn(41).setPreferredWidth(190);
        jTable1.getColumnModel().getColumn(41).setResizable(false);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        jTable1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
    }
    
    public static List<String> listaTituloColuna(){
        List<String> lista = new ArrayList<>();
        lista.add(CHNFE);
        lista.add(NATOP);
        lista.add(MOD);
        lista.add(SERIE);
        lista.add(NNF);
        lista.add(DHEMI);
        lista.add(TPNF);
        lista.add(EMITCNPJ);        
        lista.add(EMITIE);
        lista.add(EMITUF);
        lista.add(EMITNOME);
        lista.add(EMITFANT);
        lista.add(DESTCNPJ);
        lista.add(DESTCPF);
        lista.add(DESTIE);
        lista.add(DESTISUF);
        lista.add(DESTUF);
        lista.add(DESTNOME);        
        lista.add(VNF);
        lista.add(VBC);
        lista.add(VICMS);
        lista.add(VICMSDESON);
        lista.add(VBCST);
        lista.add(VPROD);        
        lista.add(VFRETE);
        lista.add(VSEG);
        lista.add(VDESC);
        lista.add(VII);
        lista.add(VIPI);
        lista.add(VPIS);
        lista.add(VCOFINS);
        lista.add(VOUTRO);
        lista.add(VTOTRIB);
        lista.add(NFAT);
        lista.add(VORIG);
        lista.add(VDESCFAT);        
        lista.add(VLIQ);
        lista.add(NDUP);
        lista.add(DVENC);
        lista.add(VDUP);        
        return lista;
    }

}
