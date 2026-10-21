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

public class HisVatVendor extends AbstractTable {
    @Id
    private String dataId;

    private String dataDate;

    private String corpId;

    private String orgId;

    private String groupId;

    private String inqOrgId;

    private String inqGroupId;

    private String vendorNo;

    private String vendorName;

    private String brActno;

    private String brName;

    private String orgNo;

    private String createYear;

    private String regType;

    private String regNo;

    private String regDate;

    private String expDate;

    private String nationalTaxNo;

    private String landTaxNo;

    private String regAddr;

    private String corpName;

    private String industryType;

    private BigDecimal employeeQuantity;

    private String region;

    private String quality;

    private String email;

    private String fax;

    private String tel;

    private String mainProduct;

    private BigDecimal area;

    private String ownership;

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

    private String remark;

    private String nextAction;

    private String dataFlag;

    private String dataStatus;

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

    private String rsv1;

    private String rsv2;

    private String rsv3;

    private String rsv4;

    private String rsv5;

    private String brNo;

    private String checkFlag;

    private String checkDesc;

    private String ofFlag;

    private String addr;

    private String vendorType;

    private String checkErrType;

    private String cContAddrEn;

    private String cTaxType;

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

    public String getVendorNo() {
        return vendorNo;
    }

    public void setVendorNo(String vendorNo) {
        this.vendorNo = vendorNo == null ? null : vendorNo.trim();
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName == null ? null : vendorName.trim();
    }

    public String getBrActno() {
        return brActno;
    }

    public void setBrActno(String brActno) {
        this.brActno = brActno == null ? null : brActno.trim();
    }

    public String getBrName() {
        return brName;
    }

    public void setBrName(String brName) {
        this.brName = brName == null ? null : brName.trim();
    }

    public String getOrgNo() {
        return orgNo;
    }

    public void setOrgNo(String orgNo) {
        this.orgNo = orgNo == null ? null : orgNo.trim();
    }

    public String getCreateYear() {
        return createYear;
    }

    public void setCreateYear(String createYear) {
        this.createYear = createYear == null ? null : createYear.trim();
    }

    public String getRegType() {
        return regType;
    }

    public void setRegType(String regType) {
        this.regType = regType == null ? null : regType.trim();
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo == null ? null : regNo.trim();
    }

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate == null ? null : regDate.trim();
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate == null ? null : expDate.trim();
    }

    public String getNationalTaxNo() {
        return nationalTaxNo;
    }

    public void setNationalTaxNo(String nationalTaxNo) {
        this.nationalTaxNo = nationalTaxNo == null ? null : nationalTaxNo.trim();
    }

    public String getLandTaxNo() {
        return landTaxNo;
    }

    public void setLandTaxNo(String landTaxNo) {
        this.landTaxNo = landTaxNo == null ? null : landTaxNo.trim();
    }

    public String getRegAddr() {
        return regAddr;
    }

    public void setRegAddr(String regAddr) {
        this.regAddr = regAddr == null ? null : regAddr.trim();
    }

    public String getCorpName() {
        return corpName;
    }

    public void setCorpName(String corpName) {
        this.corpName = corpName == null ? null : corpName.trim();
    }

    public String getIndustryType() {
        return industryType;
    }

    public void setIndustryType(String industryType) {
        this.industryType = industryType == null ? null : industryType.trim();
    }

    public BigDecimal getEmployeeQuantity() {
        return employeeQuantity;
    }

    public void setEmployeeQuantity(BigDecimal employeeQuantity) {
        this.employeeQuantity = employeeQuantity;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region == null ? null : region.trim();
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality == null ? null : quality.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax == null ? null : fax.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getMainProduct() {
        return mainProduct;
    }

    public void setMainProduct(String mainProduct) {
        this.mainProduct = mainProduct == null ? null : mainProduct.trim();
    }

    public BigDecimal getArea() {
        return area;
    }

    public void setArea(BigDecimal area) {
        this.area = area;
    }

    public String getOwnership() {
        return ownership;
    }

    public void setOwnership(String ownership) {
        this.ownership = ownership == null ? null : ownership.trim();
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getNextAction() {
        return nextAction;
    }

    public void setNextAction(String nextAction) {
        this.nextAction = nextAction == null ? null : nextAction.trim();
    }

    public String getDataFlag() {
        return dataFlag;
    }

    public void setDataFlag(String dataFlag) {
        this.dataFlag = dataFlag == null ? null : dataFlag.trim();
    }

    public String getDataStatus() {
        return dataStatus;
    }

    public void setDataStatus(String dataStatus) {
        this.dataStatus = dataStatus == null ? null : dataStatus.trim();
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

    public String getBrNo() {
        return brNo;
    }

    public void setBrNo(String brNo) {
        this.brNo = brNo == null ? null : brNo.trim();
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

    public String getOfFlag() {
        return ofFlag;
    }

    public void setOfFlag(String ofFlag) {
        this.ofFlag = ofFlag == null ? null : ofFlag.trim();
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr == null ? null : addr.trim();
    }

    public String getVendorType() {
        return vendorType;
    }

    public void setVendorType(String vendorType) {
        this.vendorType = vendorType == null ? null : vendorType.trim();
    }

    public String getCheckErrType() {
        return checkErrType;
    }

    public void setCheckErrType(String checkErrType) {
        this.checkErrType = checkErrType == null ? null : checkErrType.trim();
    }

    public String getCContAddrEn() {
        return cContAddrEn;
    }

    public void setCContAddrEn(String cContAddrEn) {
        this.cContAddrEn = cContAddrEn == null ? null : cContAddrEn.trim();
    }

    public String getCTaxType() {
        return cTaxType;
    }

    public void setCTaxType(String cTaxType) {
        this.cTaxType = cTaxType == null ? null : cTaxType.trim();
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
        case VENDOR_NO: {
            return getVendorNo();
        }
        case VENDOR_NAME: {
            return getVendorName();
        }
        case BR_ACTNO: {
            return getBrActno();
        }
        case BR_NAME: {
            return getBrName();
        }
        case ORG_NO: {
            return getOrgNo();
        }
        case CREATE_YEAR: {
            return getCreateYear();
        }
        case REG_TYPE: {
            return getRegType();
        }
        case REG_NO: {
            return getRegNo();
        }
        case REG_DATE: {
            return getRegDate();
        }
        case EXP_DATE: {
            return getExpDate();
        }
        case NATIONAL_TAX_NO: {
            return getNationalTaxNo();
        }
        case LAND_TAX_NO: {
            return getLandTaxNo();
        }
        case REG_ADDR: {
            return getRegAddr();
        }
        case CORP_NAME: {
            return getCorpName();
        }
        case INDUSTRY_TYPE: {
            return getIndustryType();
        }
        case EMPLOYEE_QUANTITY: {
            return (value = getEmployeeQuantity()) == null ? null : value.toString();
        }
        case REGION: {
            return getRegion();
        }
        case QUALITY: {
            return getQuality();
        }
        case EMAIL: {
            return getEmail();
        }
        case FAX: {
            return getFax();
        }
        case TEL: {
            return getTel();
        }
        case MAIN_PRODUCT: {
            return getMainProduct();
        }
        case AREA: {
            return (value = getArea()) == null ? null : value.toString();
        }
        case OWNERSHIP: {
            return getOwnership();
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
        case REMARK: {
            return getRemark();
        }
        case NEXT_ACTION: {
            return getNextAction();
        }
        case DATA_FLAG: {
            return getDataFlag();
        }
        case DATA_STATUS: {
            return getDataStatus();
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
        case BR_NO: {
            return getBrNo();
        }
        case CHECK_FLAG: {
            return getCheckFlag();
        }
        case CHECK_DESC: {
            return getCheckDesc();
        }
        case OF_FLAG: {
            return getOfFlag();
        }
        case ADDR: {
            return getAddr();
        }
        case VENDOR_TYPE: {
            return getVendorType();
        }
        case CHECK_ERR_TYPE: {
            return getCheckErrType();
        }
        case C_CONT_ADDR_EN: {
            return getCContAddrEn();
        }
        case C_TAX_TYPE: {
            return getCTaxType();
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

    public HisVatVendor set(Column column, String value) {
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
        case VENDOR_NO: {
            setVendorNo(value);
            break;
        }
        case VENDOR_NAME: {
            setVendorName(value);
            break;
        }
        case BR_ACTNO: {
            setBrActno(value);
            break;
        }
        case BR_NAME: {
            setBrName(value);
            break;
        }
        case ORG_NO: {
            setOrgNo(value);
            break;
        }
        case CREATE_YEAR: {
            setCreateYear(value);
            break;
        }
        case REG_TYPE: {
            setRegType(value);
            break;
        }
        case REG_NO: {
            setRegNo(value);
            break;
        }
        case REG_DATE: {
            setRegDate(value);
            break;
        }
        case EXP_DATE: {
            setExpDate(value);
            break;
        }
        case NATIONAL_TAX_NO: {
            setNationalTaxNo(value);
            break;
        }
        case LAND_TAX_NO: {
            setLandTaxNo(value);
            break;
        }
        case REG_ADDR: {
            setRegAddr(value);
            break;
        }
        case CORP_NAME: {
            setCorpName(value);
            break;
        }
        case INDUSTRY_TYPE: {
            setIndustryType(value);
            break;
        }
        case EMPLOYEE_QUANTITY: {
            value = StringUtils.stripToNull(value);
            setEmployeeQuantity(value == null ? null : new BigDecimal(value));
            break;
        }
        case REGION: {
            setRegion(value);
            break;
        }
        case QUALITY: {
            setQuality(value);
            break;
        }
        case EMAIL: {
            setEmail(value);
            break;
        }
        case FAX: {
            setFax(value);
            break;
        }
        case TEL: {
            setTel(value);
            break;
        }
        case MAIN_PRODUCT: {
            setMainProduct(value);
            break;
        }
        case AREA: {
            value = StringUtils.stripToNull(value);
            setArea(value == null ? null : new BigDecimal(value));
            break;
        }
        case OWNERSHIP: {
            setOwnership(value);
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
        case REMARK: {
            setRemark(value);
            break;
        }
        case NEXT_ACTION: {
            setNextAction(value);
            break;
        }
        case DATA_FLAG: {
            setDataFlag(value);
            break;
        }
        case DATA_STATUS: {
            setDataStatus(value);
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
        case BR_NO: {
            setBrNo(value);
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
        case OF_FLAG: {
            setOfFlag(value);
            break;
        }
        case ADDR: {
            setAddr(value);
            break;
        }
        case VENDOR_TYPE: {
            setVendorType(value);
            break;
        }
        case CHECK_ERR_TYPE: {
            setCheckErrType(value);
            break;
        }
        case C_CONT_ADDR_EN: {
            setCContAddrEn(value);
            break;
        }
        case C_TAX_TYPE: {
            setCTaxType(value);
            break;
        }
        default: {
            break;
        }}
        return this;
    }

    @Override
    public HisVatVendor set(String column, String value) {
        return set(Column.parse(column), value);
    }

    @Override
    public HisVatVendor set(Map<String, ?> map) {
        for (Column c: Column.values()) {
            if (map.containsKey(c.toString())) {
                Object v = map.get(c.toString());
                set(c, v == null ? null : v.toString());
            }
        }
        return this;
    }

    @Override
    public HisVatVendor set(AbstractTable table) {
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
        } else if (!(obj instanceof HisVatVendor)) {
            return false;
        }
        HisVatVendor rhs = (HisVatVendor) obj;
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
        if (getVendorNo() != null) {
            builder.append("vendorNo", getVendorNo());
        }
        if (getVendorName() != null) {
            builder.append("vendorName", getVendorName());
        }
        if (getBrActno() != null) {
            builder.append("brActno", getBrActno());
        }
        if (getBrName() != null) {
            builder.append("brName", getBrName());
        }
        if (getOrgNo() != null) {
            builder.append("orgNo", getOrgNo());
        }
        if (getCreateYear() != null) {
            builder.append("createYear", getCreateYear());
        }
        if (getRegType() != null) {
            builder.append("regType", getRegType());
        }
        if (getRegNo() != null) {
            builder.append("regNo", getRegNo());
        }
        if (getRegDate() != null) {
            builder.append("regDate", getRegDate());
        }
        if (getExpDate() != null) {
            builder.append("expDate", getExpDate());
        }
        if (getNationalTaxNo() != null) {
            builder.append("nationalTaxNo", getNationalTaxNo());
        }
        if (getLandTaxNo() != null) {
            builder.append("landTaxNo", getLandTaxNo());
        }
        if (getRegAddr() != null) {
            builder.append("regAddr", getRegAddr());
        }
        if (getCorpName() != null) {
            builder.append("corpName", getCorpName());
        }
        if (getIndustryType() != null) {
            builder.append("industryType", getIndustryType());
        }
        if (getEmployeeQuantity() != null) {
            builder.append("employeeQuantity", getEmployeeQuantity());
        }
        if (getRegion() != null) {
            builder.append("region", getRegion());
        }
        if (getQuality() != null) {
            builder.append("quality", getQuality());
        }
        if (getEmail() != null) {
            builder.append("email", getEmail());
        }
        if (getFax() != null) {
            builder.append("fax", getFax());
        }
        if (getTel() != null) {
            builder.append("tel", getTel());
        }
        if (getMainProduct() != null) {
            builder.append("mainProduct", getMainProduct());
        }
        if (getArea() != null) {
            builder.append("area", getArea());
        }
        if (getOwnership() != null) {
            builder.append("ownership", getOwnership());
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
        if (getRemark() != null) {
            builder.append("remark", getRemark());
        }
        if (getNextAction() != null) {
            builder.append("nextAction", getNextAction());
        }
        if (getDataFlag() != null) {
            builder.append("dataFlag", getDataFlag());
        }
        if (getDataStatus() != null) {
            builder.append("dataStatus", getDataStatus());
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
        if (getBrNo() != null) {
            builder.append("brNo", getBrNo());
        }
        if (getCheckFlag() != null) {
            builder.append("checkFlag", getCheckFlag());
        }
        if (getCheckDesc() != null) {
            builder.append("checkDesc", getCheckDesc());
        }
        if (getOfFlag() != null) {
            builder.append("ofFlag", getOfFlag());
        }
        if (getAddr() != null) {
            builder.append("addr", getAddr());
        }
        if (getVendorType() != null) {
            builder.append("vendorType", getVendorType());
        }
        if (getCheckErrType() != null) {
            builder.append("checkErrType", getCheckErrType());
        }
        if (getCContAddrEn() != null) {
            builder.append("cContAddrEn", getCContAddrEn());
        }
        if (getCTaxType() != null) {
            builder.append("cTaxType", getCTaxType());
        }
        return builder.toString();
    }

    public HisVatVendor() {
        /* pass */
    }

    public HisVatVendor(Map<String, ?> map) {
        set(map);
    }

    public HisVatVendor(AbstractTable table) {
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
        VENDOR_NO,
        VENDOR_NAME,
        BR_ACTNO,
        BR_NAME,
        ORG_NO,
        CREATE_YEAR,
        REG_TYPE,
        REG_NO,
        REG_DATE,
        EXP_DATE,
        NATIONAL_TAX_NO,
        LAND_TAX_NO,
        REG_ADDR,
        CORP_NAME,
        INDUSTRY_TYPE,
        EMPLOYEE_QUANTITY,
        REGION,
        QUALITY,
        EMAIL,
        FAX,
        TEL,
        MAIN_PRODUCT,
        AREA,
        OWNERSHIP,
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
        REMARK,
        NEXT_ACTION,
        DATA_FLAG,
        DATA_STATUS,
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
        RSV1,
        RSV2,
        RSV3,
        RSV4,
        RSV5,
        BR_NO,
        CHECK_FLAG,
        CHECK_DESC,
        OF_FLAG,
        ADDR,
        VENDOR_TYPE,
        CHECK_ERR_TYPE,
        C_CONT_ADDR_EN,
        C_TAX_TYPE;

        public static Column parse(String column) {
            try {
                return Column.valueOf(column.toUpperCase());
            } catch (Exception e) {
                return null;
            }
        }
    }
}
