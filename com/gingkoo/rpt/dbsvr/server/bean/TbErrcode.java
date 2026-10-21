package com.gingkoo.rpt.dbsvr.server.bean;

import com.gingkoo.gal.api.orm.mybatis.dbsvr.AbstractTable;
import java.util.Map;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class TbErrcode extends TbErrcodeKey {
    private String errDesc;

    private String errExtra;

    private String suggAction;

    private String rsv1;

    private String rsv2;

    private String rsv3;

    private String rsv4;

    private String rsv5;

    private static final long serialVersionUID = 1L;

    public String getErrDesc() {
        return errDesc;
    }

    public void setErrDesc(String errDesc) {
        this.errDesc = errDesc == null ? null : errDesc.trim();
    }

    public String getErrExtra() {
        return errExtra;
    }

    public void setErrExtra(String errExtra) {
        this.errExtra = errExtra == null ? null : errExtra.trim();
    }

    public String getSuggAction() {
        return suggAction;
    }

    public void setSuggAction(String suggAction) {
        this.suggAction = suggAction == null ? null : suggAction.trim();
    }

    public String getRsv1() {
        return rsv1;
    }

    public void setRsv1(String rsv1) {
        this.rsv1 = rsv1 == null ? null : rsv1.trim();
    }

    public String getRsv2() {
        return rsv2;
    }

    public void setRsv2(String rsv2) {
        this.rsv2 = rsv2 == null ? null : rsv2.trim();
    }

    public String getRsv3() {
        return rsv3;
    }

    public void setRsv3(String rsv3) {
        this.rsv3 = rsv3 == null ? null : rsv3.trim();
    }

    public String getRsv4() {
        return rsv4;
    }

    public void setRsv4(String rsv4) {
        this.rsv4 = rsv4 == null ? null : rsv4.trim();
    }

    public String getRsv5() {
        return rsv5;
    }

    public void setRsv5(String rsv5) {
        this.rsv5 = rsv5 == null ? null : rsv5.trim();
    }

    @Override
    public boolean contains(String column) {
        return Column.parse(column) != null;
    }

    public String get(Column column) {
        if (column == null) return null;
        switch (column) {
        case ERR_ID: {
            return getErrId();
        }
        case ERR_CODE: {
            return getErrCode();
        }
        case ERR_DESC: {
            return getErrDesc();
        }
        case ERR_EXTRA: {
            return getErrExtra();
        }
        case SUGG_ACTION: {
            return getSuggAction();
        }
        case RSV1: {
            return getRsv1();
        }
        case RSV2: {
            return getRsv2();
        }
        case RSV3: {
            return getRsv3();
        }
        case RSV4: {
            return getRsv4();
        }
        case RSV5: {
            return getRsv5();
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

    public TbErrcode set(Column column, String value) {
        if (column == null) return this;
        switch (column) {
        case ERR_ID: {
            setErrId(value);
            break;
        }
        case ERR_CODE: {
            setErrCode(value);
            break;
        }
        case ERR_DESC: {
            setErrDesc(value);
            break;
        }
        case ERR_EXTRA: {
            setErrExtra(value);
            break;
        }
        case SUGG_ACTION: {
            setSuggAction(value);
            break;
        }
        case RSV1: {
            setRsv1(value);
            break;
        }
        case RSV2: {
            setRsv2(value);
            break;
        }
        case RSV3: {
            setRsv3(value);
            break;
        }
        case RSV4: {
            setRsv4(value);
            break;
        }
        case RSV5: {
            setRsv5(value);
            break;
        }
        default: {
            break;
        }}
        return this;
    }

    @Override
    public TbErrcode set(String column, String value) {
        return set(Column.parse(column), value);
    }

    @Override
    public TbErrcode set(Map<String, ?> map) {
        for (Column c: Column.values()) {
            if (map.containsKey(c.toString())) {
                Object v = map.get(c.toString());
                set(c, v == null ? null : v.toString());
            }
        }
        return this;
    }

    @Override
    public TbErrcode set(AbstractTable table) {
        return set(table.get());
    }

    @Override
    public String toString() {
        ToStringBuilder builder =
                new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
        if (getErrId() != null) {
            builder.append("errId", getErrId());
        }
        if (getErrCode() != null) {
            builder.append("errCode", getErrCode());
        }
        if (getErrDesc() != null) {
            builder.append("errDesc", getErrDesc());
        }
        if (getErrExtra() != null) {
            builder.append("errExtra", getErrExtra());
        }
        if (getSuggAction() != null) {
            builder.append("suggAction", getSuggAction());
        }
        if (getRsv1() != null) {
            builder.append("rsv1", getRsv1());
        }
        if (getRsv2() != null) {
            builder.append("rsv2", getRsv2());
        }
        if (getRsv3() != null) {
            builder.append("rsv3", getRsv3());
        }
        if (getRsv4() != null) {
            builder.append("rsv4", getRsv4());
        }
        if (getRsv5() != null) {
            builder.append("rsv5", getRsv5());
        }
        return builder.toString();
    }

    public TbErrcode() {
        /* pass */
    }

    public TbErrcode(Map<String, ?> map) {
        set(map);
    }

    public TbErrcode(AbstractTable table) {
        set(table);
    }

    public enum Column {
        ERR_ID,
        ERR_CODE,
        ERR_DESC,
        ERR_EXTRA,
        SUGG_ACTION,
        RSV1,
        RSV2,
        RSV3,
        RSV4,
        RSV5;

        public static Column parse(String column) {
            try {
                return Column.valueOf(column.toUpperCase());
            } catch (Exception e) {
                return null;
            }
        }
    }
}
