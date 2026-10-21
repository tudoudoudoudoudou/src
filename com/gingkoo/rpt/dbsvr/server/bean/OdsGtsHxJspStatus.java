package com.gingkoo.rpt.dbsvr.server.bean;

import com.gingkoo.gal.api.orm.mybatis.dbsvr.AbstractTable;
import java.math.BigDecimal;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class OdsGtsHxJspStatus extends AbstractTable {
    private String nsrsbh;

    private String bkpjlx;

    private String fkpjsm;

    private String kpdh;

    private String jssbdqrq;

    private String fpsfyw;

    private String scjzrq;

    private String lxsx;

    private String qdcxbbh;

    private String dccxbbh;

    private String jspbh;

    private String bspbh;

    private String bspdcbbh;

    private String hzfwsq;

    private String fxsqxx;

    private String bsprl;

    private String sfdcsq;

    private String sfdssq;

    private BigDecimal zyfplxxe;

    private BigDecimal ptfplxxe;

    private BigDecimal zyfplxsyje;

    private BigDecimal ptfplxsyje;

    private BigDecimal zyfpkpxe;

    private BigDecimal ptfpkpxe;

    private String ssrq;

    private String sccbrq;

    private String csqsrq;

    private String bszl;

    private String bscgbz;

    private String grfpxx;

    private String thfpxx;

    private BigDecimal lxxe;

    private BigDecimal lxsyje;

    private BigDecimal dzkpxe;

    private BigDecimal yljkpxx;

    private BigDecimal yljtpxx;

    private BigDecimal byykfpje;

    private BigDecimal byytfpje;

    private static final long serialVersionUID = 1L;

    public String getNsrsbh() {
        return nsrsbh;
    }

    public void setNsrsbh(String nsrsbh) {
        this.nsrsbh = nsrsbh == null ? null : nsrsbh.trim();
    }

    public String getBkpjlx() {
        return bkpjlx;
    }

    public void setBkpjlx(String bkpjlx) {
        this.bkpjlx = bkpjlx == null ? null : bkpjlx.trim();
    }

    public String getFkpjsm() {
        return fkpjsm;
    }

    public void setFkpjsm(String fkpjsm) {
        this.fkpjsm = fkpjsm == null ? null : fkpjsm.trim();
    }

    public String getKpdh() {
        return kpdh;
    }

    public void setKpdh(String kpdh) {
        this.kpdh = kpdh == null ? null : kpdh.trim();
    }

    public String getJssbdqrq() {
        return jssbdqrq;
    }

    public void setJssbdqrq(String jssbdqrq) {
        this.jssbdqrq = jssbdqrq == null ? null : jssbdqrq.trim();
    }

    public String getFpsfyw() {
        return fpsfyw;
    }

    public void setFpsfyw(String fpsfyw) {
        this.fpsfyw = fpsfyw == null ? null : fpsfyw.trim();
    }

    public String getScjzrq() {
        return scjzrq;
    }

    public void setScjzrq(String scjzrq) {
        this.scjzrq = scjzrq == null ? null : scjzrq.trim();
    }

    public String getLxsx() {
        return lxsx;
    }

    public void setLxsx(String lxsx) {
        this.lxsx = lxsx == null ? null : lxsx.trim();
    }

    public String getQdcxbbh() {
        return qdcxbbh;
    }

    public void setQdcxbbh(String qdcxbbh) {
        this.qdcxbbh = qdcxbbh == null ? null : qdcxbbh.trim();
    }

    public String getDccxbbh() {
        return dccxbbh;
    }

    public void setDccxbbh(String dccxbbh) {
        this.dccxbbh = dccxbbh == null ? null : dccxbbh.trim();
    }

    public String getJspbh() {
        return jspbh;
    }

    public void setJspbh(String jspbh) {
        this.jspbh = jspbh == null ? null : jspbh.trim();
    }

    public String getBspbh() {
        return bspbh;
    }

    public void setBspbh(String bspbh) {
        this.bspbh = bspbh == null ? null : bspbh.trim();
    }

    public String getBspdcbbh() {
        return bspdcbbh;
    }

    public void setBspdcbbh(String bspdcbbh) {
        this.bspdcbbh = bspdcbbh == null ? null : bspdcbbh.trim();
    }

    public String getHzfwsq() {
        return hzfwsq;
    }

    public void setHzfwsq(String hzfwsq) {
        this.hzfwsq = hzfwsq == null ? null : hzfwsq.trim();
    }

    public String getFxsqxx() {
        return fxsqxx;
    }

    public void setFxsqxx(String fxsqxx) {
        this.fxsqxx = fxsqxx == null ? null : fxsqxx.trim();
    }

    public String getBsprl() {
        return bsprl;
    }

    public void setBsprl(String bsprl) {
        this.bsprl = bsprl == null ? null : bsprl.trim();
    }

    public String getSfdcsq() {
        return sfdcsq;
    }

    public void setSfdcsq(String sfdcsq) {
        this.sfdcsq = sfdcsq == null ? null : sfdcsq.trim();
    }

    public String getSfdssq() {
        return sfdssq;
    }

    public void setSfdssq(String sfdssq) {
        this.sfdssq = sfdssq == null ? null : sfdssq.trim();
    }

    public BigDecimal getZyfplxxe() {
        return zyfplxxe;
    }

    public void setZyfplxxe(BigDecimal zyfplxxe) {
        this.zyfplxxe = zyfplxxe;
    }

    public BigDecimal getPtfplxxe() {
        return ptfplxxe;
    }

    public void setPtfplxxe(BigDecimal ptfplxxe) {
        this.ptfplxxe = ptfplxxe;
    }

    public BigDecimal getZyfplxsyje() {
        return zyfplxsyje;
    }

    public void setZyfplxsyje(BigDecimal zyfplxsyje) {
        this.zyfplxsyje = zyfplxsyje;
    }

    public BigDecimal getPtfplxsyje() {
        return ptfplxsyje;
    }

    public void setPtfplxsyje(BigDecimal ptfplxsyje) {
        this.ptfplxsyje = ptfplxsyje;
    }

    public BigDecimal getZyfpkpxe() {
        return zyfpkpxe;
    }

    public void setZyfpkpxe(BigDecimal zyfpkpxe) {
        this.zyfpkpxe = zyfpkpxe;
    }

    public BigDecimal getPtfpkpxe() {
        return ptfpkpxe;
    }

    public void setPtfpkpxe(BigDecimal ptfpkpxe) {
        this.ptfpkpxe = ptfpkpxe;
    }

    public String getSsrq() {
        return ssrq;
    }

    public void setSsrq(String ssrq) {
        this.ssrq = ssrq == null ? null : ssrq.trim();
    }

    public String getSccbrq() {
        return sccbrq;
    }

    public void setSccbrq(String sccbrq) {
        this.sccbrq = sccbrq == null ? null : sccbrq.trim();
    }

    public String getCsqsrq() {
        return csqsrq;
    }

    public void setCsqsrq(String csqsrq) {
        this.csqsrq = csqsrq == null ? null : csqsrq.trim();
    }

    public String getBszl() {
        return bszl;
    }

    public void setBszl(String bszl) {
        this.bszl = bszl == null ? null : bszl.trim();
    }

    public String getBscgbz() {
        return bscgbz;
    }

    public void setBscgbz(String bscgbz) {
        this.bscgbz = bscgbz == null ? null : bscgbz.trim();
    }

    public String getGrfpxx() {
        return grfpxx;
    }

    public void setGrfpxx(String grfpxx) {
        this.grfpxx = grfpxx == null ? null : grfpxx.trim();
    }

    public String getThfpxx() {
        return thfpxx;
    }

    public void setThfpxx(String thfpxx) {
        this.thfpxx = thfpxx == null ? null : thfpxx.trim();
    }

    public BigDecimal getLxxe() {
        return lxxe;
    }

    public void setLxxe(BigDecimal lxxe) {
        this.lxxe = lxxe;
    }

    public BigDecimal getLxsyje() {
        return lxsyje;
    }

    public void setLxsyje(BigDecimal lxsyje) {
        this.lxsyje = lxsyje;
    }

    public BigDecimal getDzkpxe() {
        return dzkpxe;
    }

    public void setDzkpxe(BigDecimal dzkpxe) {
        this.dzkpxe = dzkpxe;
    }

    public BigDecimal getYljkpxx() {
        return yljkpxx;
    }

    public void setYljkpxx(BigDecimal yljkpxx) {
        this.yljkpxx = yljkpxx;
    }

    public BigDecimal getYljtpxx() {
        return yljtpxx;
    }

    public void setYljtpxx(BigDecimal yljtpxx) {
        this.yljtpxx = yljtpxx;
    }

    public BigDecimal getByykfpje() {
        return byykfpje;
    }

    public void setByykfpje(BigDecimal byykfpje) {
        this.byykfpje = byykfpje;
    }

    public BigDecimal getByytfpje() {
        return byytfpje;
    }

    public void setByytfpje(BigDecimal byytfpje) {
        this.byytfpje = byytfpje;
    }

    @Override
    public boolean contains(String column) {
        return Column.parse(column) != null;
    }

    public String get(Column column) {
        Object value;
        if (column == null) return null;
        switch (column) {
        case NSRSBH: {
            return getNsrsbh();
        }
        case BKPJLX: {
            return getBkpjlx();
        }
        case FKPJSM: {
            return getFkpjsm();
        }
        case KPDH: {
            return getKpdh();
        }
        case JSSBDQRQ: {
            return getJssbdqrq();
        }
        case FPSFYW: {
            return getFpsfyw();
        }
        case SCJZRQ: {
            return getScjzrq();
        }
        case LXSX: {
            return getLxsx();
        }
        case QDCXBBH: {
            return getQdcxbbh();
        }
        case DCCXBBH: {
            return getDccxbbh();
        }
        case JSPBH: {
            return getJspbh();
        }
        case BSPBH: {
            return getBspbh();
        }
        case BSPDCBBH: {
            return getBspdcbbh();
        }
        case HZFWSQ: {
            return getHzfwsq();
        }
        case FXSQXX: {
            return getFxsqxx();
        }
        case BSPRL: {
            return getBsprl();
        }
        case SFDCSQ: {
            return getSfdcsq();
        }
        case SFDSSQ: {
            return getSfdssq();
        }
        case ZYFPLXXE: {
            return (value = getZyfplxxe()) == null ? null : value.toString();
        }
        case PTFPLXXE: {
            return (value = getPtfplxxe()) == null ? null : value.toString();
        }
        case ZYFPLXSYJE: {
            return (value = getZyfplxsyje()) == null ? null : value.toString();
        }
        case PTFPLXSYJE: {
            return (value = getPtfplxsyje()) == null ? null : value.toString();
        }
        case ZYFPKPXE: {
            return (value = getZyfpkpxe()) == null ? null : value.toString();
        }
        case PTFPKPXE: {
            return (value = getPtfpkpxe()) == null ? null : value.toString();
        }
        case SSRQ: {
            return getSsrq();
        }
        case SCCBRQ: {
            return getSccbrq();
        }
        case CSQSRQ: {
            return getCsqsrq();
        }
        case BSZL: {
            return getBszl();
        }
        case BSCGBZ: {
            return getBscgbz();
        }
        case GRFPXX: {
            return getGrfpxx();
        }
        case THFPXX: {
            return getThfpxx();
        }
        case LXXE: {
            return (value = getLxxe()) == null ? null : value.toString();
        }
        case LXSYJE: {
            return (value = getLxsyje()) == null ? null : value.toString();
        }
        case DZKPXE: {
            return (value = getDzkpxe()) == null ? null : value.toString();
        }
        case YLJKPXX: {
            return (value = getYljkpxx()) == null ? null : value.toString();
        }
        case YLJTPXX: {
            return (value = getYljtpxx()) == null ? null : value.toString();
        }
        case BYYKFPJE: {
            return (value = getByykfpje()) == null ? null : value.toString();
        }
        case BYYTFPJE: {
            return (value = getByytfpje()) == null ? null : value.toString();
        }
        default: {
            return null;
        }}
    }

    @Override
    public String get(String column) {
        return get(Column.parse(column));
    }

    @Override
    public Map<String, String> get(Map<String, String> map) {
        for (Column c: Column.values()) {
            map.put(c.toString(), get(c));
        }
        return map;
    }

    public OdsGtsHxJspStatus set(Column column, String value) {
        if (column == null) return this;
        switch (column) {
        case NSRSBH: {
            setNsrsbh(value);
            break;
        }
        case BKPJLX: {
            setBkpjlx(value);
            break;
        }
        case FKPJSM: {
            setFkpjsm(value);
            break;
        }
        case KPDH: {
            setKpdh(value);
            break;
        }
        case JSSBDQRQ: {
            setJssbdqrq(value);
            break;
        }
        case FPSFYW: {
            setFpsfyw(value);
            break;
        }
        case SCJZRQ: {
            setScjzrq(value);
            break;
        }
        case LXSX: {
            setLxsx(value);
            break;
        }
        case QDCXBBH: {
            setQdcxbbh(value);
            break;
        }
        case DCCXBBH: {
            setDccxbbh(value);
            break;
        }
        case JSPBH: {
            setJspbh(value);
            break;
        }
        case BSPBH: {
            setBspbh(value);
            break;
        }
        case BSPDCBBH: {
            setBspdcbbh(value);
            break;
        }
        case HZFWSQ: {
            setHzfwsq(value);
            break;
        }
        case FXSQXX: {
            setFxsqxx(value);
            break;
        }
        case BSPRL: {
            setBsprl(value);
            break;
        }
        case SFDCSQ: {
            setSfdcsq(value);
            break;
        }
        case SFDSSQ: {
            setSfdssq(value);
            break;
        }
        case ZYFPLXXE: {
            value = StringUtils.stripToNull(value);
            setZyfplxxe(value == null ? null : new BigDecimal(value));
            break;
        }
        case PTFPLXXE: {
            value = StringUtils.stripToNull(value);
            setPtfplxxe(value == null ? null : new BigDecimal(value));
            break;
        }
        case ZYFPLXSYJE: {
            value = StringUtils.stripToNull(value);
            setZyfplxsyje(value == null ? null : new BigDecimal(value));
            break;
        }
        case PTFPLXSYJE: {
            value = StringUtils.stripToNull(value);
            setPtfplxsyje(value == null ? null : new BigDecimal(value));
            break;
        }
        case ZYFPKPXE: {
            value = StringUtils.stripToNull(value);
            setZyfpkpxe(value == null ? null : new BigDecimal(value));
            break;
        }
        case PTFPKPXE: {
            value = StringUtils.stripToNull(value);
            setPtfpkpxe(value == null ? null : new BigDecimal(value));
            break;
        }
        case SSRQ: {
            setSsrq(value);
            break;
        }
        case SCCBRQ: {
            setSccbrq(value);
            break;
        }
        case CSQSRQ: {
            setCsqsrq(value);
            break;
        }
        case BSZL: {
            setBszl(value);
            break;
        }
        case BSCGBZ: {
            setBscgbz(value);
            break;
        }
        case GRFPXX: {
            setGrfpxx(value);
            break;
        }
        case THFPXX: {
            setThfpxx(value);
            break;
        }
        case LXXE: {
            value = StringUtils.stripToNull(value);
            setLxxe(value == null ? null : new BigDecimal(value));
            break;
        }
        case LXSYJE: {
            value = StringUtils.stripToNull(value);
            setLxsyje(value == null ? null : new BigDecimal(value));
            break;
        }
        case DZKPXE: {
            value = StringUtils.stripToNull(value);
            setDzkpxe(value == null ? null : new BigDecimal(value));
            break;
        }
        case YLJKPXX: {
            value = StringUtils.stripToNull(value);
            setYljkpxx(value == null ? null : new BigDecimal(value));
            break;
        }
        case YLJTPXX: {
            value = StringUtils.stripToNull(value);
            setYljtpxx(value == null ? null : new BigDecimal(value));
            break;
        }
        case BYYKFPJE: {
            value = StringUtils.stripToNull(value);
            setByykfpje(value == null ? null : new BigDecimal(value));
            break;
        }
        case BYYTFPJE: {
            value = StringUtils.stripToNull(value);
            setByytfpje(value == null ? null : new BigDecimal(value));
            break;
        }
        default: {
            break;
        }}
        return this;
    }

    @Override
    public OdsGtsHxJspStatus set(String column, String value) {
        return set(Column.parse(column), value);
    }

    @Override
    public OdsGtsHxJspStatus set(Map<String, ?> map) {
        for (Column c: Column.values()) {
            if (map.containsKey(c.toString())) {
                Object v = map.get(c.toString());
                set(c, v == null ? null : v.toString());
            }
        }
        return this;
    }

    @Override
    public OdsGtsHxJspStatus set(AbstractTable table) {
        return set(table.get());
    }

    @Override
    public String toKey() {
        StringBuilder sb = new StringBuilder();
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        } else if (obj == this) {
            return true;
        } else if (!(obj instanceof OdsGtsHxJspStatus)) {
            return false;
        }
        OdsGtsHxJspStatus rhs = (OdsGtsHxJspStatus) obj;
        return new EqualsBuilder()
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .toHashCode();
    }

    @Override
    public String toString() {
        ToStringBuilder builder =
                new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
        if (getNsrsbh() != null) {
            builder.append("nsrsbh", getNsrsbh());
        }
        if (getBkpjlx() != null) {
            builder.append("bkpjlx", getBkpjlx());
        }
        if (getFkpjsm() != null) {
            builder.append("fkpjsm", getFkpjsm());
        }
        if (getKpdh() != null) {
            builder.append("kpdh", getKpdh());
        }
        if (getJssbdqrq() != null) {
            builder.append("jssbdqrq", getJssbdqrq());
        }
        if (getFpsfyw() != null) {
            builder.append("fpsfyw", getFpsfyw());
        }
        if (getScjzrq() != null) {
            builder.append("scjzrq", getScjzrq());
        }
        if (getLxsx() != null) {
            builder.append("lxsx", getLxsx());
        }
        if (getQdcxbbh() != null) {
            builder.append("qdcxbbh", getQdcxbbh());
        }
        if (getDccxbbh() != null) {
            builder.append("dccxbbh", getDccxbbh());
        }
        if (getJspbh() != null) {
            builder.append("jspbh", getJspbh());
        }
        if (getBspbh() != null) {
            builder.append("bspbh", getBspbh());
        }
        if (getBspdcbbh() != null) {
            builder.append("bspdcbbh", getBspdcbbh());
        }
        if (getHzfwsq() != null) {
            builder.append("hzfwsq", getHzfwsq());
        }
        if (getFxsqxx() != null) {
            builder.append("fxsqxx", getFxsqxx());
        }
        if (getBsprl() != null) {
            builder.append("bsprl", getBsprl());
        }
        if (getSfdcsq() != null) {
            builder.append("sfdcsq", getSfdcsq());
        }
        if (getSfdssq() != null) {
            builder.append("sfdssq", getSfdssq());
        }
        if (getZyfplxxe() != null) {
            builder.append("zyfplxxe", getZyfplxxe());
        }
        if (getPtfplxxe() != null) {
            builder.append("ptfplxxe", getPtfplxxe());
        }
        if (getZyfplxsyje() != null) {
            builder.append("zyfplxsyje", getZyfplxsyje());
        }
        if (getPtfplxsyje() != null) {
            builder.append("ptfplxsyje", getPtfplxsyje());
        }
        if (getZyfpkpxe() != null) {
            builder.append("zyfpkpxe", getZyfpkpxe());
        }
        if (getPtfpkpxe() != null) {
            builder.append("ptfpkpxe", getPtfpkpxe());
        }
        if (getSsrq() != null) {
            builder.append("ssrq", getSsrq());
        }
        if (getSccbrq() != null) {
            builder.append("sccbrq", getSccbrq());
        }
        if (getCsqsrq() != null) {
            builder.append("csqsrq", getCsqsrq());
        }
        if (getBszl() != null) {
            builder.append("bszl", getBszl());
        }
        if (getBscgbz() != null) {
            builder.append("bscgbz", getBscgbz());
        }
        if (getGrfpxx() != null) {
            builder.append("grfpxx", getGrfpxx());
        }
        if (getThfpxx() != null) {
            builder.append("thfpxx", getThfpxx());
        }
        if (getLxxe() != null) {
            builder.append("lxxe", getLxxe());
        }
        if (getLxsyje() != null) {
            builder.append("lxsyje", getLxsyje());
        }
        if (getDzkpxe() != null) {
            builder.append("dzkpxe", getDzkpxe());
        }
        if (getYljkpxx() != null) {
            builder.append("yljkpxx", getYljkpxx());
        }
        if (getYljtpxx() != null) {
            builder.append("yljtpxx", getYljtpxx());
        }
        if (getByykfpje() != null) {
            builder.append("byykfpje", getByykfpje());
        }
        if (getByytfpje() != null) {
            builder.append("byytfpje", getByytfpje());
        }
        return builder.toString();
    }

    public OdsGtsHxJspStatus() {
        /* pass */
    }

    public OdsGtsHxJspStatus(Map<String, ?> map) {
        set(map);
    }

    public OdsGtsHxJspStatus(AbstractTable table) {
        set(table);
    }

    public enum Column {
        NSRSBH,
        BKPJLX,
        FKPJSM,
        KPDH,
        JSSBDQRQ,
        FPSFYW,
        SCJZRQ,
        LXSX,
        QDCXBBH,
        DCCXBBH,
        JSPBH,
        BSPBH,
        BSPDCBBH,
        HZFWSQ,
        FXSQXX,
        BSPRL,
        SFDCSQ,
        SFDSSQ,
        ZYFPLXXE,
        PTFPLXXE,
        ZYFPLXSYJE,
        PTFPLXSYJE,
        ZYFPKPXE,
        PTFPKPXE,
        SSRQ,
        SCCBRQ,
        CSQSRQ,
        BSZL,
        BSCGBZ,
        GRFPXX,
        THFPXX,
        LXXE,
        LXSYJE,
        DZKPXE,
        YLJKPXX,
        YLJTPXX,
        BYYKFPJE,
        BYYTFPJE;

        public static Column parse(String column) {
            try {
                return Column.valueOf(column.toUpperCase());
            } catch (Exception e) {
                return null;
            }
        }
    }
}
