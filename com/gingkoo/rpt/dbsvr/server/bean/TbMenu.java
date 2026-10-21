package com.gingkoo.rpt.dbsvr.server.bean;

import com.gingkoo.gal.api.orm.mybatis.dbsvr.AbstractTable;
import java.math.BigDecimal;
import java.util.Map;
import javax.persistence.Id;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class TbMenu extends AbstractTable {
    @Id
    private String menuId;

    private String pmenuId;

    private String menuName;

    private String cmd;

    private String icon;

    private String separator;

    private BigDecimal morder;

    private String moduleId;

    private String nodeflag;

    private String txno;

    private String sysId;

    private String status;

    private String rsv1;

    private String rsv2;

    private String rsv3;

    private String rsv4;

    private String rsv5;

    private static final long serialVersionUID = 1L;

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId == null ? null : menuId.trim();
    }

    public String getPmenuId() {
        return pmenuId;
    }

    public void setPmenuId(String pmenuId) {
        this.pmenuId = pmenuId == null ? null : pmenuId.trim();
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName == null ? null : menuName.trim();
    }

    public String getCmd() {
        return cmd;
    }

    public void setCmd(String cmd) {
        this.cmd = cmd == null ? null : cmd.trim();
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    public String getSeparator() {
        return separator;
    }

    public void setSeparator(String separator) {
        this.separator = separator == null ? null : separator.trim();
    }

    public BigDecimal getMorder() {
        return morder;
    }

    public void setMorder(BigDecimal morder) {
        this.morder = morder;
    }

    public String getModuleId() {
        return moduleId;
    }

    public void setModuleId(String moduleId) {
        this.moduleId = moduleId == null ? null : moduleId.trim();
    }

    public String getNodeflag() {
        return nodeflag;
    }

    public void setNodeflag(String nodeflag) {
        this.nodeflag = nodeflag == null ? null : nodeflag.trim();
    }

    public String getTxno() {
        return txno;
    }

    public void setTxno(String txno) {
        this.txno = txno == null ? null : txno.trim();
    }

    public String getSysId() {
        return sysId;
    }

    public void setSysId(String sysId) {
        this.sysId = sysId == null ? null : sysId.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
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
        Object value;
        if (column == null) return null;
        switch (column) {
        case MENU_ID: {
            return getMenuId();
        }
        case PMENU_ID: {
            return getPmenuId();
        }
        case MENU_NAME: {
            return getMenuName();
        }
        case CMD: {
            return getCmd();
        }
        case ICON: {
            return getIcon();
        }
        case SEPARATOR: {
            return getSeparator();
        }
        case MORDER: {
            return (value = getMorder()) == null ? null : value.toString();
        }
        case MODULE_ID: {
            return getModuleId();
        }
        case NODEFLAG: {
            return getNodeflag();
        }
        case TXNO: {
            return getTxno();
        }
        case SYS_ID: {
            return getSysId();
        }
        case STATUS: {
            return getStatus();
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

    public TbMenu set(Column column, String value) {
        if (column == null) return this;
        switch (column) {
        case MENU_ID: {
            setMenuId(value);
            break;
        }
        case PMENU_ID: {
            setPmenuId(value);
            break;
        }
        case MENU_NAME: {
            setMenuName(value);
            break;
        }
        case CMD: {
            setCmd(value);
            break;
        }
        case ICON: {
            setIcon(value);
            break;
        }
        case SEPARATOR: {
            setSeparator(value);
            break;
        }
        case MORDER: {
            value = StringUtils.stripToNull(value);
            setMorder(value == null ? null : new BigDecimal(value));
            break;
        }
        case MODULE_ID: {
            setModuleId(value);
            break;
        }
        case NODEFLAG: {
            setNodeflag(value);
            break;
        }
        case TXNO: {
            setTxno(value);
            break;
        }
        case SYS_ID: {
            setSysId(value);
            break;
        }
        case STATUS: {
            setStatus(value);
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
    public TbMenu set(String column, String value) {
        return set(Column.parse(column), value);
    }

    @Override
    public TbMenu set(Map<String, ?> map) {
        for (Column c: Column.values()) {
            if (map.containsKey(c.toString())) {
                Object v = map.get(c.toString());
                set(c, v == null ? null : v.toString());
            }
        }
        return this;
    }

    @Override
    public TbMenu set(AbstractTable table) {
        return set(table.get());
    }

    @Override
    public String toKey() {
        StringBuilder sb = new StringBuilder();
        sb.append(getMenuId()).append("|");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        } else if (obj == this) {
            return true;
        } else if (!(obj instanceof TbMenu)) {
            return false;
        }
        TbMenu rhs = (TbMenu) obj;
        return new EqualsBuilder()
                .append(getMenuId(), rhs.getMenuId())
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .append(getMenuId())
                .toHashCode();
    }

    @Override
    public String toString() {
        ToStringBuilder builder =
                new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
        if (getMenuId() != null) {
            builder.append("menuId", getMenuId());
        }
        if (getPmenuId() != null) {
            builder.append("pmenuId", getPmenuId());
        }
        if (getMenuName() != null) {
            builder.append("menuName", getMenuName());
        }
        if (getCmd() != null) {
            builder.append("cmd", getCmd());
        }
        if (getIcon() != null) {
            builder.append("icon", getIcon());
        }
        if (getSeparator() != null) {
            builder.append("separator", getSeparator());
        }
        if (getMorder() != null) {
            builder.append("morder", getMorder());
        }
        if (getModuleId() != null) {
            builder.append("moduleId", getModuleId());
        }
        if (getNodeflag() != null) {
            builder.append("nodeflag", getNodeflag());
        }
        if (getTxno() != null) {
            builder.append("txno", getTxno());
        }
        if (getSysId() != null) {
            builder.append("sysId", getSysId());
        }
        if (getStatus() != null) {
            builder.append("status", getStatus());
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

    public TbMenu() {
        /* pass */
    }

    public TbMenu(Map<String, ?> map) {
        set(map);
    }

    public TbMenu(AbstractTable table) {
        set(table);
    }

    public enum Column {
        MENU_ID,
        PMENU_ID,
        MENU_NAME,
        CMD,
        ICON,
        SEPARATOR,
        MORDER,
        MODULE_ID,
        NODEFLAG,
        TXNO,
        SYS_ID,
        STATUS,
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
