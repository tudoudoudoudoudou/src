package com.gingkoo.rpt.dbsvr.server.bean;

import com.gingkoo.gal.api.orm.mybatis.dbsvr.AbstractTable;
import java.util.Map;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class TbSysparams extends TbSysparamsKey {
    private String paramVal;

    private String paramName;

    private String ifCanmodify;

    private String remark;

    private String filler1;

    private String filler2;

    private String filler3;

    private String sysId;

    private String loadType;

    private static final long serialVersionUID = 1L;

    public String getParamVal() {
        return paramVal;
    }

    public void setParamVal(String paramVal) {
        this.paramVal = paramVal == null ? null : paramVal.trim();
    }

    public String getParamName() {
        return paramName;
    }

    public void setParamName(String paramName) {
        this.paramName = paramName == null ? null : paramName.trim();
    }

    public String getIfCanmodify() {
        return ifCanmodify;
    }

    public void setIfCanmodify(String ifCanmodify) {
        this.ifCanmodify = ifCanmodify == null ? null : ifCanmodify.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getFiller1() {
        return filler1;
    }

    public void setFiller1(String filler1) {
        this.filler1 = filler1 == null ? null : filler1.trim();
    }

    public String getFiller2() {
        return filler2;
    }

    public void setFiller2(String filler2) {
        this.filler2 = filler2 == null ? null : filler2.trim();
    }

    public String getFiller3() {
        return filler3;
    }

    public void setFiller3(String filler3) {
        this.filler3 = filler3 == null ? null : filler3.trim();
    }

    public String getSysId() {
        return sysId;
    }

    public void setSysId(String sysId) {
        this.sysId = sysId == null ? null : sysId.trim();
    }

    public String getLoadType() {
        return loadType;
    }

    public void setLoadType(String loadType) {
        this.loadType = loadType == null ? null : loadType.trim();
    }

    @Override
    public boolean contains(String column) {
        return Column.parse(column) != null;
    }

    public String get(Column column) {
        if (column == null) return null;
        switch (column) {
        case PARAM_ID: {
            return getParamId();
        }
        case PARAMGROUP_ID: {
            return getParamgroupId();
        }
        case CORP_ID: {
            return getCorpId();
        }
        case PARAM_VAL: {
            return getParamVal();
        }
        case PARAM_NAME: {
            return getParamName();
        }
        case IF_CANMODIFY: {
            return getIfCanmodify();
        }
        case REMARK: {
            return getRemark();
        }
        case FILLER1: {
            return getFiller1();
        }
        case FILLER2: {
            return getFiller2();
        }
        case FILLER3: {
            return getFiller3();
        }
        case SYS_ID: {
            return getSysId();
        }
        case LOAD_TYPE: {
            return getLoadType();
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

    public TbSysparams set(Column column, String value) {
        if (column == null) return this;
        switch (column) {
        case PARAM_ID: {
            setParamId(value);
            break;
        }
        case PARAMGROUP_ID: {
            setParamgroupId(value);
            break;
        }
        case CORP_ID: {
            setCorpId(value);
            break;
        }
        case PARAM_VAL: {
            setParamVal(value);
            break;
        }
        case PARAM_NAME: {
            setParamName(value);
            break;
        }
        case IF_CANMODIFY: {
            setIfCanmodify(value);
            break;
        }
        case REMARK: {
            setRemark(value);
            break;
        }
        case FILLER1: {
            setFiller1(value);
            break;
        }
        case FILLER2: {
            setFiller2(value);
            break;
        }
        case FILLER3: {
            setFiller3(value);
            break;
        }
        case SYS_ID: {
            setSysId(value);
            break;
        }
        case LOAD_TYPE: {
            setLoadType(value);
            break;
        }
        default: {
            break;
        }}
        return this;
    }

    @Override
    public TbSysparams set(String column, String value) {
        return set(Column.parse(column), value);
    }

    @Override
    public TbSysparams set(Map<String, ?> map) {
        for (Column c: Column.values()) {
            if (map.containsKey(c.toString())) {
                Object v = map.get(c.toString());
                set(c, v == null ? null : v.toString());
            }
        }
        return this;
    }

    @Override
    public TbSysparams set(AbstractTable table) {
        return set(table.get());
    }

    @Override
    public String toString() {
        ToStringBuilder builder =
                new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
        if (getParamId() != null) {
            builder.append("paramId", getParamId());
        }
        if (getParamgroupId() != null) {
            builder.append("paramgroupId", getParamgroupId());
        }
        if (getCorpId() != null) {
            builder.append("corpId", getCorpId());
        }
        if (getParamVal() != null) {
            builder.append("paramVal", getParamVal());
        }
        if (getParamName() != null) {
            builder.append("paramName", getParamName());
        }
        if (getIfCanmodify() != null) {
            builder.append("ifCanmodify", getIfCanmodify());
        }
        if (getRemark() != null) {
            builder.append("remark", getRemark());
        }
        if (getFiller1() != null) {
            builder.append("filler1", getFiller1());
        }
        if (getFiller2() != null) {
            builder.append("filler2", getFiller2());
        }
        if (getFiller3() != null) {
            builder.append("filler3", getFiller3());
        }
        if (getSysId() != null) {
            builder.append("sysId", getSysId());
        }
        if (getLoadType() != null) {
            builder.append("loadType", getLoadType());
        }
        return builder.toString();
    }

    public TbSysparams() {
        /* pass */
    }

    public TbSysparams(Map<String, ?> map) {
        set(map);
    }

    public TbSysparams(AbstractTable table) {
        set(table);
    }

    public enum Column {
        PARAM_ID,
        PARAMGROUP_ID,
        CORP_ID,
        PARAM_VAL,
        PARAM_NAME,
        IF_CANMODIFY,
        REMARK,
        FILLER1,
        FILLER2,
        FILLER3,
        SYS_ID,
        LOAD_TYPE;

        public static Column parse(String column) {
            try {
                return Column.valueOf(column.toUpperCase());
            } catch (Exception e) {
                return null;
            }
        }
    }
}
