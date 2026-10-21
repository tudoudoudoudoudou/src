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

public class OdsCsvVatCustomer extends AbstractTable {
    @Id
    private String dataId;

    private String dataDate;

    private String corpId;

    private String orgId;

    private String groupId;

    private String inqOrgId;

    private String inqGroupId;

    private String custBrno;

    private String custNo;

    private String custType;

    private String name;

    private String addr;

    private String tel;

    private String zipCode;

    private String city;

    private String email;

    private String taxEntType;

    private String taxNo;

    private String brname;

    private String acctno;

    private String contName;

    private String contTel;

    private String contFax;

    private String contEmail;

    private String contContry;

    private String contProvince;

    private String contCity;

    private String contCounty;

    private String contAddr;

    private String contZip;

    private String ofFlag;

    private String needVocFlag;

    private String impFileName;

    private String impTime;

    private String checkFlag;

    private String checkDesc;

    private String checkErrType;

    private String nextAction;

    private String dataStatus;

    private String dataFlag;

    private String dataSource;

    private BigDecimal dataVersion;

    private String dataRejDesc;

    private String dataDelDesc;

    private String dataCrtUser;

    private String dataCrtDate;

    private String dataCrtTime;

    private String dataChgUser;

    private String dataChgDate;

    private String dataChgTime;

    private String dataApvUser;

    private String dataApvDate;

    private String dataApvTime;

    private String ext1;

    private String ext2;

    private String ext3;

    private String ext4;

    private String ext5;

    private static final long serialVersionUID = 1L;

    public String getDataId() {
        return dataId;
    }

    public void setDataId(String dataId) {
        this.dataId = dataId == null ? null : dataId.trim();
    }

    public String getDataDate() {
        return dataDate;
    }

    public void setDataDate(String dataDate) {
        this.dataDate = dataDate == null ? null : dataDate.trim();
    }

    public String getCorpId() {
        return corpId;
    }

    public void setCorpId(String corpId) {
        this.corpId = corpId == null ? null : corpId.trim();
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId == null ? null : groupId.trim();
    }

    public String getInqOrgId() {
        return inqOrgId;
    }

    public void setInqOrgId(String inqOrgId) {
        this.inqOrgId = inqOrgId == null ? null : inqOrgId.trim();
    }

    public String getInqGroupId() {
        return inqGroupId;
    }

    public void setInqGroupId(String inqGroupId) {
        this.inqGroupId = inqGroupId == null ? null : inqGroupId.trim();
    }

    public String getCustBrno() {
        return custBrno;
    }

    public void setCustBrno(String custBrno) {
        this.custBrno = custBrno == null ? null : custBrno.trim();
    }

    public String getCustNo() {
        return custNo;
    }

    public void setCustNo(String custNo) {
        this.custNo = custNo == null ? null : custNo.trim();
    }

    public String getCustType() {
        return custType;
    }

    public void setCustType(String custType) {
        this.custType = custType == null ? null : custType.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr == null ? null : addr.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode == null ? null : zipCode.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getTaxEntType() {
        return taxEntType;
    }

    public void setTaxEntType(String taxEntType) {
        this.taxEntType = taxEntType == null ? null : taxEntType.trim();
    }

    public String getTaxNo() {
        return taxNo;
    }

    public void setTaxNo(String taxNo) {
        this.taxNo = taxNo == null ? null : taxNo.trim();
    }

    public String getBrname() {
        return brname;
    }

    public void setBrname(String brname) {
        this.brname = brname == null ? null : brname.trim();
    }

    public String getAcctno() {
        return acctno;
    }

    public void setAcctno(String acctno) {
        this.acctno = acctno == null ? null : acctno.trim();
    }

    public String getContName() {
        return contName;
    }

    public void setContName(String contName) {
        this.contName = contName == null ? null : contName.trim();
    }

    public String getContTel() {
        return contTel;
    }

    public void setContTel(String contTel) {
        this.contTel = contTel == null ? null : contTel.trim();
    }

    public String getContFax() {
        return contFax;
    }

    public void setContFax(String contFax) {
        this.contFax = contFax == null ? null : contFax.trim();
    }

    public String getContEmail() {
        return contEmail;
    }

    public void setContEmail(String contEmail) {
        this.contEmail = contEmail == null ? null : contEmail.trim();
    }

    public String getContContry() {
        return contContry;
    }

    public void setContContry(String contContry) {
        this.contContry = contContry == null ? null : contContry.trim();
    }

    public String getContProvince() {
        return contProvince;
    }

    public void setContProvince(String contProvince) {
        this.contProvince = contProvince == null ? null : contProvince.trim();
    }

    public String getContCity() {
        return contCity;
    }

    public void setContCity(String contCity) {
        this.contCity = contCity == null ? null : contCity.trim();
    }

    public String getContCounty() {
        return contCounty;
    }

    public void setContCounty(String contCounty) {
        this.contCounty = contCounty == null ? null : contCounty.trim();
    }

    public String getContAddr() {
        return contAddr;
    }

    public void setContAddr(String contAddr) {
        this.contAddr = contAddr == null ? null : contAddr.trim();
    }

    public String getContZip() {
        return contZip;
    }

    public void setContZip(String contZip) {
        this.contZip = contZip == null ? null : contZip.trim();
    }

    public String getOfFlag() {
        return ofFlag;
    }

    public void setOfFlag(String ofFlag) {
        this.ofFlag = ofFlag == null ? null : ofFlag.trim();
    }

    public String getNeedVocFlag() {
        return needVocFlag;
    }

    public void setNeedVocFlag(String needVocFlag) {
        this.needVocFlag = needVocFlag == null ? null : needVocFlag.trim();
    }

    public String getImpFileName() {
        return impFileName;
    }

    public void setImpFileName(String impFileName) {
        this.impFileName = impFileName == null ? null : impFileName.trim();
    }

    public String getImpTime() {
        return impTime;
    }

    public void setImpTime(String impTime) {
        this.impTime = impTime == null ? null : impTime.trim();
    }

    public String getCheckFlag() {
        return checkFlag;
    }

    public void setCheckFlag(String checkFlag) {
        this.checkFlag = checkFlag == null ? null : checkFlag.trim();
    }

    public String getCheckDesc() {
        return checkDesc;
    }

    public void setCheckDesc(String checkDesc) {
        this.checkDesc = checkDesc == null ? null : checkDesc.trim();
    }

    public String getCheckErrType() {
        return checkErrType;
    }

    public void setCheckErrType(String checkErrType) {
        this.checkErrType = checkErrType == null ? null : checkErrType.trim();
    }

    public String getNextAction() {
        return nextAction;
    }

    public void setNextAction(String nextAction) {
        this.nextAction = nextAction == null ? null : nextAction.trim();
    }

    public String getDataStatus() {
        return dataStatus;
    }

    public void setDataStatus(String dataStatus) {
        this.dataStatus = dataStatus == null ? null : dataStatus.trim();
    }

    public String getDataFlag() {
        return dataFlag;
    }

    public void setDataFlag(String dataFlag) {
        this.dataFlag = dataFlag == null ? null : dataFlag.trim();
    }

    public String getDataSource() {
        return dataSource;
    }

    public void setDataSource(String dataSource) {
        this.dataSource = dataSource == null ? null : dataSource.trim();
    }

    public BigDecimal getDataVersion() {
        return dataVersion;
    }

    public void setDataVersion(BigDecimal dataVersion) {
        this.dataVersion = dataVersion;
    }

    public String getDataRejDesc() {
        return dataRejDesc;
    }

    public void setDataRejDesc(String dataRejDesc) {
        this.dataRejDesc = dataRejDesc == null ? null : dataRejDesc.trim();
    }

    public String getDataDelDesc() {
        return dataDelDesc;
    }

    public void setDataDelDesc(String dataDelDesc) {
        this.dataDelDesc = dataDelDesc == null ? null : dataDelDesc.trim();
    }

    public String getDataCrtUser() {
        return dataCrtUser;
    }

    public void setDataCrtUser(String dataCrtUser) {
        this.dataCrtUser = dataCrtUser == null ? null : dataCrtUser.trim();
    }

    public String getDataCrtDate() {
        return dataCrtDate;
    }

    public void setDataCrtDate(String dataCrtDate) {
        this.dataCrtDate = dataCrtDate == null ? null : dataCrtDate.trim();
    }

    public String getDataCrtTime() {
        return dataCrtTime;
    }

    public void setDataCrtTime(String dataCrtTime) {
        this.dataCrtTime = dataCrtTime == null ? null : dataCrtTime.trim();
    }

    public String getDataChgUser() {
        return dataChgUser;
    }

    public void setDataChgUser(String dataChgUser) {
        this.dataChgUser = dataChgUser == null ? null : dataChgUser.trim();
    }

    public String getDataChgDate() {
        return dataChgDate;
    }

    public void setDataChgDate(String dataChgDate) {
        this.dataChgDate = dataChgDate == null ? null : dataChgDate.trim();
    }

    public String getDataChgTime() {
        return dataChgTime;
    }

    public void setDataChgTime(String dataChgTime) {
        this.dataChgTime = dataChgTime == null ? null : dataChgTime.trim();
    }

    public String getDataApvUser() {
        return dataApvUser;
    }

    public void setDataApvUser(String dataApvUser) {
        this.dataApvUser = dataApvUser == null ? null : dataApvUser.trim();
    }

    public String getDataApvDate() {
        return dataApvDate;
    }

    public void setDataApvDate(String dataApvDate) {
        this.dataApvDate = dataApvDate == null ? null : dataApvDate.trim();
    }

    public String getDataApvTime() {
        return dataApvTime;
    }

    public void setDataApvTime(String dataApvTime) {
        this.dataApvTime = dataApvTime == null ? null : dataApvTime.trim();
    }

    public String getExt1() {
        return ext1;
    }

    public void setExt1(String ext1) {
        this.ext1 = ext1 == null ? null : ext1.trim();
    }

    public String getExt2() {
        return ext2;
    }

    public void setExt2(String ext2) {
        this.ext2 = ext2 == null ? null : ext2.trim();
    }

    public String getExt3() {
        return ext3;
    }

    public void setExt3(String ext3) {
        this.ext3 = ext3 == null ? null : ext3.trim();
    }

    public String getExt4() {
        return ext4;
    }

    public void setExt4(String ext4) {
        this.ext4 = ext4 == null ? null : ext4.trim();
    }

    public String getExt5() {
        return ext5;
    }

    public void setExt5(String ext5) {
        this.ext5 = ext5 == null ? null : ext5.trim();
    }

    @Override
    public boolean contains(String column) {
        return Column.parse(column) != null;
    }

    public String get(Column column) {
        Object value;
        if (column == null) return null;
        switch (column) {
        case DATA_ID: {
            return getDataId();
        }
        case DATA_DATE: {
            return getDataDate();
        }
        case CORP_ID: {
            return getCorpId();
        }
        case ORG_ID: {
            return getOrgId();
        }
        case GROUP_ID: {
            return getGroupId();
        }
        case INQ_ORG_ID: {
            return getInqOrgId();
        }
        case INQ_GROUP_ID: {
            return getInqGroupId();
        }
        case CUST_BRNO: {
            return getCustBrno();
        }
        case CUST_NO: {
            return getCustNo();
        }
        case CUST_TYPE: {
            return getCustType();
        }
        case NAME: {
            return getName();
        }
        case ADDR: {
            return getAddr();
        }
        case TEL: {
            return getTel();
        }
        case ZIP_CODE: {
            return getZipCode();
        }
        case CITY: {
            return getCity();
        }
        case EMAIL: {
            return getEmail();
        }
        case TAX_ENT_TYPE: {
            return getTaxEntType();
        }
        case TAX_NO: {
            return getTaxNo();
        }
        case BRNAME: {
            return getBrname();
        }
        case ACCTNO: {
            return getAcctno();
        }
        case CONT_NAME: {
            return getContName();
        }
        case CONT_TEL: {
            return getContTel();
        }
        case CONT_FAX: {
            return getContFax();
        }
        case CONT_EMAIL: {
            return getContEmail();
        }
        case CONT_CONTRY: {
            return getContContry();
        }
        case CONT_PROVINCE: {
            return getContProvince();
        }
        case CONT_CITY: {
            return getContCity();
        }
        case CONT_COUNTY: {
            return getContCounty();
        }
        case CONT_ADDR: {
            return getContAddr();
        }
        case CONT_ZIP: {
            return getContZip();
        }
        case OF_FLAG: {
            return getOfFlag();
        }
        case NEED_VOC_FLAG: {
            return getNeedVocFlag();
        }
        case IMP_FILE_NAME: {
            return getImpFileName();
        }
        case IMP_TIME: {
            return getImpTime();
        }
        case CHECK_FLAG: {
            return getCheckFlag();
        }
        case CHECK_DESC: {
            return getCheckDesc();
        }
        case CHECK_ERR_TYPE: {
            return getCheckErrType();
        }
        case NEXT_ACTION: {
            return getNextAction();
        }
        case DATA_STATUS: {
            return getDataStatus();
        }
        case DATA_FLAG: {
            return getDataFlag();
        }
        case DATA_SOURCE: {
            return getDataSource();
        }
        case DATA_VERSION: {
            return (value = getDataVersion()) == null ? null : value.toString();
        }
        case DATA_REJ_DESC: {
            return getDataRejDesc();
        }
        case DATA_DEL_DESC: {
            return getDataDelDesc();
        }
        case DATA_CRT_USER: {
            return getDataCrtUser();
        }
        case DATA_CRT_DATE: {
            return getDataCrtDate();
        }
        case DATA_CRT_TIME: {
            return getDataCrtTime();
        }
        case DATA_CHG_USER: {
            return getDataChgUser();
        }
        case DATA_CHG_DATE: {
            return getDataChgDate();
        }
        case DATA_CHG_TIME: {
            return getDataChgTime();
        }
        case DATA_APV_USER: {
            return getDataApvUser();
        }
        case DATA_APV_DATE: {
            return getDataApvDate();
        }
        case DATA_APV_TIME: {
            return getDataApvTime();
        }
        case EXT1: {
            return getExt1();
        }
        case EXT2: {
            return getExt2();
        }
        case EXT3: {
            return getExt3();
        }
        case EXT4: {
            return getExt4();
        }
        case EXT5: {
            return getExt5();
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

    public OdsCsvVatCustomer set(Column column, String value) {
        if (column == null) return this;
        switch (column) {
        case DATA_ID: {
            setDataId(value);
            break;
        }
        case DATA_DATE: {
            setDataDate(value);
            break;
        }
        case CORP_ID: {
            setCorpId(value);
            break;
        }
        case ORG_ID: {
            setOrgId(value);
            break;
        }
        case GROUP_ID: {
            setGroupId(value);
            break;
        }
        case INQ_ORG_ID: {
            setInqOrgId(value);
            break;
        }
        case INQ_GROUP_ID: {
            setInqGroupId(value);
            break;
        }
        case CUST_BRNO: {
            setCustBrno(value);
            break;
        }
        case CUST_NO: {
            setCustNo(value);
            break;
        }
        case CUST_TYPE: {
            setCustType(value);
            break;
        }
        case NAME: {
            setName(value);
            break;
        }
        case ADDR: {
            setAddr(value);
            break;
        }
        case TEL: {
            setTel(value);
            break;
        }
        case ZIP_CODE: {
            setZipCode(value);
            break;
        }
        case CITY: {
            setCity(value);
            break;
        }
        case EMAIL: {
            setEmail(value);
            break;
        }
        case TAX_ENT_TYPE: {
            setTaxEntType(value);
            break;
        }
        case TAX_NO: {
            setTaxNo(value);
            break;
        }
        case BRNAME: {
            setBrname(value);
            break;
        }
        case ACCTNO: {
            setAcctno(value);
            break;
        }
        case CONT_NAME: {
            setContName(value);
            break;
        }
        case CONT_TEL: {
            setContTel(value);
            break;
        }
        case CONT_FAX: {
            setContFax(value);
            break;
        }
        case CONT_EMAIL: {
            setContEmail(value);
            break;
        }
        case CONT_CONTRY: {
            setContContry(value);
            break;
        }
        case CONT_PROVINCE: {
            setContProvince(value);
            break;
        }
        case CONT_CITY: {
            setContCity(value);
            break;
        }
        case CONT_COUNTY: {
            setContCounty(value);
            break;
        }
        case CONT_ADDR: {
            setContAddr(value);
            break;
        }
        case CONT_ZIP: {
            setContZip(value);
            break;
        }
        case OF_FLAG: {
            setOfFlag(value);
            break;
        }
        case NEED_VOC_FLAG: {
            setNeedVocFlag(value);
            break;
        }
        case IMP_FILE_NAME: {
            setImpFileName(value);
            break;
        }
        case IMP_TIME: {
            setImpTime(value);
            break;
        }
        case CHECK_FLAG: {
            setCheckFlag(value);
            break;
        }
        case CHECK_DESC: {
            setCheckDesc(value);
            break;
        }
        case CHECK_ERR_TYPE: {
            setCheckErrType(value);
            break;
        }
        case NEXT_ACTION: {
            setNextAction(value);
            break;
        }
        case DATA_STATUS: {
            setDataStatus(value);
            break;
        }
        case DATA_FLAG: {
            setDataFlag(value);
            break;
        }
        case DATA_SOURCE: {
            setDataSource(value);
            break;
        }
        case DATA_VERSION: {
            value = StringUtils.stripToNull(value);
            setDataVersion(value == null ? null : new BigDecimal(value));
            break;
        }
        case DATA_REJ_DESC: {
            setDataRejDesc(value);
            break;
        }
        case DATA_DEL_DESC: {
            setDataDelDesc(value);
            break;
        }
        case DATA_CRT_USER: {
            setDataCrtUser(value);
            break;
        }
        case DATA_CRT_DATE: {
            setDataCrtDate(value);
            break;
        }
        case DATA_CRT_TIME: {
            setDataCrtTime(value);
            break;
        }
        case DATA_CHG_USER: {
            setDataChgUser(value);
            break;
        }
        case DATA_CHG_DATE: {
            setDataChgDate(value);
            break;
        }
        case DATA_CHG_TIME: {
            setDataChgTime(value);
            break;
        }
        case DATA_APV_USER: {
            setDataApvUser(value);
            break;
        }
        case DATA_APV_DATE: {
            setDataApvDate(value);
            break;
        }
        case DATA_APV_TIME: {
            setDataApvTime(value);
            break;
        }
        case EXT1: {
            setExt1(value);
            break;
        }
        case EXT2: {
            setExt2(value);
            break;
        }
        case EXT3: {
            setExt3(value);
            break;
        }
        case EXT4: {
            setExt4(value);
            break;
        }
        case EXT5: {
            setExt5(value);
            break;
        }
        default: {
            break;
        }}
        return this;
    }

    @Override
    public OdsCsvVatCustomer set(String column, String value) {
        return set(Column.parse(column), value);
    }

    @Override
    public OdsCsvVatCustomer set(Map<String, ?> map) {
        for (Column c: Column.values()) {
            if (map.containsKey(c.toString())) {
                Object v = map.get(c.toString());
                set(c, v == null ? null : v.toString());
            }
        }
        return this;
    }

    @Override
    public OdsCsvVatCustomer set(AbstractTable table) {
        return set(table.get());
    }

    @Override
    public String toKey() {
        StringBuilder sb = new StringBuilder();
        sb.append(getDataId()).append("|");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        } else if (obj == this) {
            return true;
        } else if (!(obj instanceof OdsCsvVatCustomer)) {
            return false;
        }
        OdsCsvVatCustomer rhs = (OdsCsvVatCustomer) obj;
        return new EqualsBuilder()
                .append(getDataId(), rhs.getDataId())
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .append(getDataId())
                .toHashCode();
    }

    @Override
    public String toString() {
        ToStringBuilder builder =
                new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
        if (getDataId() != null) {
            builder.append("dataId", getDataId());
        }
        if (getDataDate() != null) {
            builder.append("dataDate", getDataDate());
        }
        if (getCorpId() != null) {
            builder.append("corpId", getCorpId());
        }
        if (getOrgId() != null) {
            builder.append("orgId", getOrgId());
        }
        if (getGroupId() != null) {
            builder.append("groupId", getGroupId());
        }
        if (getInqOrgId() != null) {
            builder.append("inqOrgId", getInqOrgId());
        }
        if (getInqGroupId() != null) {
            builder.append("inqGroupId", getInqGroupId());
        }
        if (getCustBrno() != null) {
            builder.append("custBrno", getCustBrno());
        }
        if (getCustNo() != null) {
            builder.append("custNo", getCustNo());
        }
        if (getCustType() != null) {
            builder.append("custType", getCustType());
        }
        if (getName() != null) {
            builder.append("name", getName());
        }
        if (getAddr() != null) {
            builder.append("addr", getAddr());
        }
        if (getTel() != null) {
            builder.append("tel", getTel());
        }
        if (getZipCode() != null) {
            builder.append("zipCode", getZipCode());
        }
        if (getCity() != null) {
            builder.append("city", getCity());
        }
        if (getEmail() != null) {
            builder.append("email", getEmail());
        }
        if (getTaxEntType() != null) {
            builder.append("taxEntType", getTaxEntType());
        }
        if (getTaxNo() != null) {
            builder.append("taxNo", getTaxNo());
        }
        if (getBrname() != null) {
            builder.append("brname", getBrname());
        }
        if (getAcctno() != null) {
            builder.append("acctno", getAcctno());
        }
        if (getContName() != null) {
            builder.append("contName", getContName());
        }
        if (getContTel() != null) {
            builder.append("contTel", getContTel());
        }
        if (getContFax() != null) {
            builder.append("contFax", getContFax());
        }
        if (getContEmail() != null) {
            builder.append("contEmail", getContEmail());
        }
        if (getContContry() != null) {
            builder.append("contContry", getContContry());
        }
        if (getContProvince() != null) {
            builder.append("contProvince", getContProvince());
        }
        if (getContCity() != null) {
            builder.append("contCity", getContCity());
        }
        if (getContCounty() != null) {
            builder.append("contCounty", getContCounty());
        }
        if (getContAddr() != null) {
            builder.append("contAddr", getContAddr());
        }
        if (getContZip() != null) {
            builder.append("contZip", getContZip());
        }
        if (getOfFlag() != null) {
            builder.append("ofFlag", getOfFlag());
        }
        if (getNeedVocFlag() != null) {
            builder.append("needVocFlag", getNeedVocFlag());
        }
        if (getImpFileName() != null) {
            builder.append("impFileName", getImpFileName());
        }
        if (getImpTime() != null) {
            builder.append("impTime", getImpTime());
        }
        if (getCheckFlag() != null) {
            builder.append("checkFlag", getCheckFlag());
        }
        if (getCheckDesc() != null) {
            builder.append("checkDesc", getCheckDesc());
        }
        if (getCheckErrType() != null) {
            builder.append("checkErrType", getCheckErrType());
        }
        if (getNextAction() != null) {
            builder.append("nextAction", getNextAction());
        }
        if (getDataStatus() != null) {
            builder.append("dataStatus", getDataStatus());
        }
        if (getDataFlag() != null) {
            builder.append("dataFlag", getDataFlag());
        }
        if (getDataSource() != null) {
            builder.append("dataSource", getDataSource());
        }
        if (getDataVersion() != null) {
            builder.append("dataVersion", getDataVersion());
        }
        if (getDataRejDesc() != null) {
            builder.append("dataRejDesc", getDataRejDesc());
        }
        if (getDataDelDesc() != null) {
            builder.append("dataDelDesc", getDataDelDesc());
        }
        if (getDataCrtUser() != null) {
            builder.append("dataCrtUser", getDataCrtUser());
        }
        if (getDataCrtDate() != null) {
            builder.append("dataCrtDate", getDataCrtDate());
        }
        if (getDataCrtTime() != null) {
            builder.append("dataCrtTime", getDataCrtTime());
        }
        if (getDataChgUser() != null) {
            builder.append("dataChgUser", getDataChgUser());
        }
        if (getDataChgDate() != null) {
            builder.append("dataChgDate", getDataChgDate());
        }
        if (getDataChgTime() != null) {
            builder.append("dataChgTime", getDataChgTime());
        }
        if (getDataApvUser() != null) {
            builder.append("dataApvUser", getDataApvUser());
        }
        if (getDataApvDate() != null) {
            builder.append("dataApvDate", getDataApvDate());
        }
        if (getDataApvTime() != null) {
            builder.append("dataApvTime", getDataApvTime());
        }
        if (getExt1() != null) {
            builder.append("ext1", getExt1());
        }
        if (getExt2() != null) {
            builder.append("ext2", getExt2());
        }
        if (getExt3() != null) {
            builder.append("ext3", getExt3());
        }
        if (getExt4() != null) {
            builder.append("ext4", getExt4());
        }
        if (getExt5() != null) {
            builder.append("ext5", getExt5());
        }
        return builder.toString();
    }

    public OdsCsvVatCustomer() {
        /* pass */
    }

    public OdsCsvVatCustomer(Map<String, ?> map) {
        set(map);
    }

    public OdsCsvVatCustomer(AbstractTable table) {
        set(table);
    }

    public enum Column {
        DATA_ID,
        DATA_DATE,
        CORP_ID,
        ORG_ID,
        GROUP_ID,
        INQ_ORG_ID,
        INQ_GROUP_ID,
        CUST_BRNO,
        CUST_NO,
        CUST_TYPE,
        NAME,
        ADDR,
        TEL,
        ZIP_CODE,
        CITY,
        EMAIL,
        TAX_ENT_TYPE,
        TAX_NO,
        BRNAME,
        ACCTNO,
        CONT_NAME,
        CONT_TEL,
        CONT_FAX,
        CONT_EMAIL,
        CONT_CONTRY,
        CONT_PROVINCE,
        CONT_CITY,
        CONT_COUNTY,
        CONT_ADDR,
        CONT_ZIP,
        OF_FLAG,
        NEED_VOC_FLAG,
        IMP_FILE_NAME,
        IMP_TIME,
        CHECK_FLAG,
        CHECK_DESC,
        CHECK_ERR_TYPE,
        NEXT_ACTION,
        DATA_STATUS,
        DATA_FLAG,
        DATA_SOURCE,
        DATA_VERSION,
        DATA_REJ_DESC,
        DATA_DEL_DESC,
        DATA_CRT_USER,
        DATA_CRT_DATE,
        DATA_CRT_TIME,
        DATA_CHG_USER,
        DATA_CHG_DATE,
        DATA_CHG_TIME,
        DATA_APV_USER,
        DATA_APV_DATE,
        DATA_APV_TIME,
        EXT1,
        EXT2,
        EXT3,
        EXT4,
        EXT5;

        public static Column parse(String column) {
            try {
                return Column.valueOf(column.toUpperCase());
            } catch (Exception e) {
                return null;
            }
        }
    }
}
