/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.importnfe.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

/**
 *
 * @author daniel
 */
public class Nfe implements Serializable{
    
    private Integer id;
    private String chNFe;
    private String natOp;
    private int mod;
    private int serie;
    private String nNF;
    private LocalDateTime dhEmi;
    private int tpNF;
    private String emitCnpj;
    private String emitIe;
    private String emitUf;
    private String emitNome;
    private String emitFant;
    private String destCnpj;
    private String destCpf;
    private String destIe;
    private String destIsuf;
    private String destUf;
    private String destNome;
    private double vNF;
    private double vBC;
    private double vICMS;
    private double vICMSDeson;
    private double vBCST;
    private double vProd;
    private double vFrete;
    private double vSeg;
    private double vDesc;
    private double vII;
    private double vIPI;
    private double vPIS;
    private double vCOFINS;
    private double vOutro;
    private double vTotTrib;
    private String nFat;
    private double vOrig;
    private double vDescFat;
    private double vLiq;
    private String nDup;
    private LocalDate dVenc;
    private double vDup;
    private LocalDateTime createAt;

    public Nfe() {

    }
    
    public Nfe(Integer id, String chNFe, String natOp, int mod, int serie, String nNF, LocalDateTime dhEmi, int tpNF, String emitCnpj, String emitIe, String emitUf, String emitNome, String emitFant, String destCnpj, String destCpf, String destIe, String destIsuf, String destUf, String destNome, double vNF, double vBC, double vICMS, double vICMSDeson, double vBCST, double vProd, double vFrete, double vSeg, double vDesc, double vII, double vIPI, double vPIS, double vCOFINS, double vOutro, double vTotTrib, String nFat, double vOrig, double vDescFat, double vLiq, String nDup, LocalDate dVenc, double vDup, LocalDateTime createAt) {
        this.id = id;
        this.chNFe = chNFe;
        this.natOp = natOp;
        this.mod = mod;
        this.serie = serie;
        this.nNF = nNF;
        this.dhEmi = dhEmi;
        this.tpNF = tpNF;
        this.emitCnpj = emitCnpj;
        this.emitIe = emitIe;
        this.emitUf = emitUf;
        this.emitNome = emitNome;
        this.emitFant = emitFant;
        this.destCnpj = destCnpj;
        this.destCpf = destCpf;
        this.destIe = destIe;
        this.destIsuf = destIsuf;
        this.destUf = destUf;
        this.destNome = destNome;
        this.vNF = vNF;
        this.vBC = vBC;
        this.vICMS = vICMS;
        this.vICMSDeson = vICMSDeson;
        this.vBCST = vBCST;
        this.vProd = vProd;
        this.vFrete = vFrete;
        this.vSeg = vSeg;
        this.vDesc = vDesc;
        this.vII = vII;
        this.vIPI = vIPI;
        this.vPIS = vPIS;
        this.vCOFINS = vCOFINS;
        this.vOutro = vOutro;
        this.vTotTrib = vTotTrib;
        this.nFat = nFat;
        this.vOrig = vOrig;
        this.vDescFat = vDescFat;
        this.vLiq = vLiq;
        this.nDup = nDup;
        this.dVenc = dVenc;
        this.vDup = vDup;
        this.createAt = createAt;
    }

    public Nfe(String chNFe, String natOp, int mod, int serie, String nNF, LocalDateTime dhEmi, int tpNF, String emitCnpj, String emitIe, String emitUf, String emitNome, String emitFant, String destCnpj, String destCpf, String destIe, String destIsuf, String destUf, String destNome, double vNF, double vBC, double vICMS, double vICMSDeson, double vBCST, double vProd, double vFrete, double vSeg, double vDesc, double vII, double vIPI, double vPIS, double vCOFINS, double vOutro, double vTotTrib, String nFat, double vOrig, double vDescFat, double vLiq, String nDup, LocalDate dVenc, double vDup) {
        this.chNFe = chNFe;
        this.natOp = natOp;
        this.mod = mod;
        this.serie = serie;
        this.nNF = nNF;
        this.dhEmi = dhEmi;
        this.tpNF = tpNF;
        this.emitCnpj = emitCnpj;
        this.emitIe = emitIe;
        this.emitUf = emitUf;
        this.emitNome = emitNome;
        this.emitFant = emitFant;
        this.destCnpj = destCnpj;
        this.destCpf = destCpf;
        this.destIe = destIe;
        this.destIsuf = destIsuf;
        this.destUf = destUf;
        this.destNome = destNome;
        this.vNF = vNF;
        this.vBC = vBC;
        this.vICMS = vICMS;
        this.vICMSDeson = vICMSDeson;
        this.vBCST = vBCST;
        this.vProd = vProd;
        this.vFrete = vFrete;
        this.vSeg = vSeg;
        this.vDesc = vDesc;
        this.vII = vII;
        this.vIPI = vIPI;
        this.vPIS = vPIS;
        this.vCOFINS = vCOFINS;
        this.vOutro = vOutro;
        this.vTotTrib = vTotTrib;
        this.nFat = nFat;
        this.vOrig = vOrig;
        this.vDescFat = vDescFat;
        this.vLiq = vLiq;
        this.nDup = nDup;
        this.dVenc = dVenc;
        this.vDup = vDup;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getChNFe() {
        return chNFe;
    }

    public void setChNFe(String chNFe) {
        this.chNFe = chNFe;
    }

    public String getNatOp() {
        return natOp;
    }

    public void setNatOp(String natOp) {
        this.natOp = natOp;
    }

    public int getMod() {
        return mod;
    }

    public void setMod(int mod) {
        this.mod = mod;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public String getnNF() {
        return nNF;
    }

    public void setnNF(String nNF) {
        this.nNF = nNF;
    }

    public LocalDateTime getDhEmi() {
        return dhEmi;
    }

    public void setDhEmi(LocalDateTime dhEmi) {
        this.dhEmi = dhEmi;
    }

    public int getTpNF() {
        return tpNF;
    }

    public void setTpNF(int tpNF) {
        this.tpNF = tpNF;
    }

    public String getEmitCnpj() {
        return emitCnpj;
    }

    public void setEmitCnpj(String emitCnpj) {
        this.emitCnpj = emitCnpj;
    }

    public String getEmitIe() {
        return emitIe;
    }

    public void setEmitIe(String emitIe) {
        this.emitIe = emitIe;
    }

    public String getEmitUf() {
        return emitUf;
    }

    public void setEmitUf(String emitUf) {
        this.emitUf = emitUf;
    }

    public String getEmitNome() {
        return emitNome;
    }

    public void setEmitNome(String emitNome) {
        this.emitNome = emitNome;
    }

    public String getEmitFant() {
        return emitFant;
    }

    public void setEmitFant(String emitFant) {
        this.emitFant = emitFant;
    }

    public String getDestCnpj() {
        return destCnpj;
    }

    public void setDestCnpj(String destCnpj) {
        this.destCnpj = destCnpj;
    }

    public String getDestCpf() {
        return destCpf;
    }

    public void setDestCpf(String destCpf) {
        this.destCpf = destCpf;
    }

    public String getDestIe() {
        return destIe;
    }

    public void setDestIe(String destIe) {
        this.destIe = destIe;
    }

    public String getDestIsuf() {
        return destIsuf;
    }

    public void setDestIsuf(String destIsuf) {
        this.destIsuf = destIsuf;
    }

    public String getDestUf() {
        return destUf;
    }

    public void setDestUf(String destUf) {
        this.destUf = destUf;
    }

    public String getDestNome() {
        return destNome;
    }

    public void setDestNome(String destNome) {
        this.destNome = destNome;
    }

    public double getvNF() {
        return vNF;
    }

    public void setvNF(double vNF) {
        this.vNF = vNF;
    }

    public double getvBC() {
        return vBC;
    }

    public void setvBC(double vBC) {
        this.vBC = vBC;
    }

    public double getvICMS() {
        return vICMS;
    }

    public void setvICMS(double vICMS) {
        this.vICMS = vICMS;
    }

    public double getvICMSDeson() {
        return vICMSDeson;
    }

    public void setvICMSDeson(double vICMSDeson) {
        this.vICMSDeson = vICMSDeson;
    }

    public double getvBCST() {
        return vBCST;
    }

    public void setvBCST(double vBCST) {
        this.vBCST = vBCST;
    }

    public double getvProd() {
        return vProd;
    }

    public void setvProd(double vProd) {
        this.vProd = vProd;
    }

    public double getvFrete() {
        return vFrete;
    }

    public void setvFrete(double vFrete) {
        this.vFrete = vFrete;
    }

    public double getvSeg() {
        return vSeg;
    }

    public void setvSeg(double vSeg) {
        this.vSeg = vSeg;
    }

    public double getvDesc() {
        return vDesc;
    }

    public void setvDesc(double vDesc) {
        this.vDesc = vDesc;
    }

    public double getvII() {
        return vII;
    }

    public void setvII(double vII) {
        this.vII = vII;
    }

    public double getvIPI() {
        return vIPI;
    }

    public void setvIPI(double vIPI) {
        this.vIPI = vIPI;
    }

    public double getvPIS() {
        return vPIS;
    }

    public void setvPIS(double vPIS) {
        this.vPIS = vPIS;
    }

    public double getvCOFINS() {
        return vCOFINS;
    }

    public void setvCOFINS(double vCOFINS) {
        this.vCOFINS = vCOFINS;
    }

    public double getvOutro() {
        return vOutro;
    }

    public void setvOutro(double vOutro) {
        this.vOutro = vOutro;
    }

    public double getvTotTrib() {
        return vTotTrib;
    }

    public void setvTotTrib(double vTotTrib) {
        this.vTotTrib = vTotTrib;
    }

    public String getnFat() {
        return nFat;
    }

    public void setnFat(String nFat) {
        this.nFat = nFat;
    }

    public double getvOrig() {
        return vOrig;
    }

    public void setvOrig(double vOrig) {
        this.vOrig = vOrig;
    }

    public double getvDescFat() {
        return vDescFat;
    }

    public void setvDescFat(double vDescFat) {
        this.vDescFat = vDescFat;
    }

    public double getvLiq() {
        return vLiq;
    }

    public void setvLiq(double vLiq) {
        this.vLiq = vLiq;
    }

    public String getnDup() {
        return nDup;
    }

    public void setnDup(String nDup) {
        this.nDup = nDup;
    }

    public LocalDate getdVenc() {
        return dVenc;
    }

    public void setdVenc(LocalDate dVenc) {
        this.dVenc = dVenc;
    }

    public double getvDup() {
        return vDup;
    }

    public void setvDup(double vDup) {
        this.vDup = vDup;
    }

    @Override
    public String toString() {
        return "Nfe{" + "chNFe=" + chNFe + ", natOp=" + natOp + ", mod=" + mod + ", serie=" + serie + ", nNF=" + nNF + ", dhEmi=" + dhEmi + ", tpNF=" + tpNF + ", emitCnpj=" + emitCnpj + ", emitIe=" + emitIe + ", emitUf=" + emitUf + ", emitNome=" + emitNome + ", emitFant=" + emitFant + ", destCnpj=" + destCnpj + ", destCpf=" + destCpf + ", destIe=" + destIe + ", destIsuf=" + destIsuf + ", destUf=" + destUf + ", destNome=" + destNome + ", vNF=" + vNF + ", vBC=" + vBC + ", vICMS=" + vICMS + ", vICMSDeson=" + vICMSDeson + ", vBCST=" + vBCST + ", vProd=" + vProd + ", vFrete=" + vFrete + ", vSeg=" + vSeg + ", vDesc=" + vDesc + ", vII=" + vII + ", vIPI=" + vIPI + ", vPIS=" + vPIS + ", vCOFINS=" + vCOFINS + ", vOutro=" + vOutro + ", vTotTrib=" + vTotTrib + ", nFat=" + nFat + ", vOrig=" + vOrig + ", vDescFat=" + vDescFat + ", vLiq=" + vLiq + ", nDup=" + nDup + ", dVenc=" + dVenc + ", vDup=" + vDup + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.id);
        hash = 17 * hash + Objects.hashCode(this.chNFe);
        hash = 17 * hash + Objects.hashCode(this.emitCnpj);
        hash = 17 * hash + Objects.hashCode(this.destCnpj);
        hash = 17 * hash + Objects.hashCode(this.destCpf);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Nfe other = (Nfe) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.chNFe, other.chNFe)) {
            return false;
        }
        if (!Objects.equals(this.nNF, other.nNF)) {
            return false;
        }
        if (!Objects.equals(this.emitCnpj, other.emitCnpj)) {
            return false;
        }
        if (!Objects.equals(this.destCnpj, other.destCnpj)) {
            return false;
        }
        if (!Objects.equals(this.destCpf, other.destCpf)) {
            return false;
        }
        return true;
    }

   
 
    
}
