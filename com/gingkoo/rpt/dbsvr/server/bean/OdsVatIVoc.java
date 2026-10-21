package com.gingkoo.rpt.dbsvr.server.bean;

import com.gingkoo.gal.api.orm.mybatis.dbsvr.AbstractTable;
import java.math.BigDecimal;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class OdsVatIVoc extends AbstractTable {
    private String dataId;

    private String dataDate;

    private String corpId;

    private String orgId;

    private String groupId;

    private String inqOrgId;

    private String inqGroupId;

    private String vocCode;

    private String vocNo;

    private String vocDate;

    private String vocMac;

    private String custNo;

    private String buyName;

    private String buyTaxNo;

    private String buyAddr;

    private String buyTel;

    private String buyBankNo;

    private String buyActNo;

    private String saleName;

    private String saleTaxNo;

    private String saleAddr;

    private String saleTel;

    private String saleBankNo;

    private String saleActNo;

    private String remarks;

    private String payeeName;

    private BigDecimal amount;

    private BigDecimal taxAmt;

    private BigDecimal sumAmt;

    private String vocUser;

    private String apvUser;

    private String scanUser;

    private String scanDate;

    private String isCheck;

    private String identyUser;

    private String identyStatus;

    private String identyDate;

    private BigDecimal identyCount;

    private String identyType;

    private BigDecimal outAmt;

    private String imgDir;

    private String caclTaxType;

    private String vocFlag;

    private String txType;

    private String txCode;

    private String seqNo;

    private String payReqNo;

    private String txDate;

    private String sysId;

    private String checkFlag;

    private String checkDesc;

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

    private String docType;

    private String rsv1;

    private String rsv2;

    private String rsv3;

    private String rsv4;

    private String rsv5;

    private String checkErrType;

    private String formCoding;

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

    public String getVocCode() {
        return vocCode;
    }

    public void setVocCode(String vocCode) {
        this.vocCode = vocCode == null ? null : vocCode.trim();
    }

    public String getVocNo() {
        return vocNo;
    }

    public void setVocNo(String vocNo) {
        this.vocNo = vocNo == null ? null : vocNo.trim();
    }

    public String getVocDate() {
        return vocDate;
    }

    public void setVocDate(String vocDate) {
        this.vocDate = vocDate == null ? null : vocDate.trim();
    }

    public String getVocMac() {
        return vocMac;
    }

    public void setVocMac(String vocMac) {
        this.vocMac = vocMac == null ? null : vocMac.trim();
    }

    public String getCustNo() {
        return custNo;
    }

    public void setCustNo(String custNo) {
        this.custNo = custNo == null ? null : custNo.trim();
    }

    public String getBuyName() {
        return buyName;
    }

    public void setBuyName(String buyName) {
        this.buyName = buyName == null ? null : buyName.trim();
    }

    public String getBuyTaxNo() {
        return buyTaxNo;
    }

    public void setBuyTaxNo(String buyTaxNo) {
        this.buyTaxNo = buyTaxNo == null ? null : buyTaxNo.trim();
    }

    public String getBuyAddr() {
        return buyAddr;
    }

    public void setBuyAddr(String buyAddr) {
        this.buyAddr = buyAddr == null ? null : buyAddr.trim();
    }

    public String getBuyTel() {
        return buyTel;
    }

    public void setBuyTel(String buyTel) {
        this.buyTel = buyTel == null ? null : buyTel.trim();
    }

    public String getBuyBankNo() {
        return buyBankNo;
    }

    public void setBuyBankNo(String buyBankNo) {
        this.buyBankNo = buyBankNo == null ? null : buyBankNo.trim();
    }

    public String getBuyActNo() {
        return buyActNo;
    }

    public void setBuyActNo(String buyActNo) {
        this.buyActNo = buyActNo == null ? null : buyActNo.trim();
    }

    public String getSaleName() {
        return saleName;
    }

    public void setSaleName(String saleName) {
        this.saleName = saleName == null ? null : saleName.trim();
    }

    public String getSaleTaxNo() {
        return saleTaxNo;
    }

    public void setSaleTaxNo(String saleTaxNo) {
        this.saleTaxNo = saleTaxNo == null ? null : saleTaxNo.trim();
    }

    public String getSaleAddr() {
        return saleAddr;
    }

    public void setSaleAddr(String saleAddr) {
        this.saleAddr = saleAddr == null ? null : saleAddr.trim();
    }

    public String getSaleTel() {
        return saleTel;
    }

    public void setSaleTel(String saleTel) {
        this.saleTel = saleTel == null ? null : saleTel.trim();
    }

    public String getSaleBankNo() {
        return saleBankNo;
    }

    public void setSaleBankNo(String saleBankNo) {
        this.saleBankNo = saleBankNo == null ? null : saleBankNo.trim();
    }

    public String getSaleActNo() {
        return saleActNo;
    }

    public void setSaleActNo(String saleActNo) {
        this.saleActNo = saleActNo == null ? null : saleActNo.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public String getPayeeName() {
        return payeeName;
    }

    public void setPayeeName(String payeeName) {
        this.payeeName = payeeName == null ? null : payeeName.trim();
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getTaxAmt() {
        return taxAmt;
    }

    public void setTaxAmt(BigDecimal taxAmt) {
        this.taxAmt = taxAmt;
    }

    public BigDecimal getSumAmt() {
        return sumAmt;
    }

    public void setSumAmt(BigDecimal sumAmt) {
        this.sumAmt = sumAmt;
    }

    public String getVocUser() {
        return vocUser;
    }

    public void setVocUser(String vocUser) {
        this.vocUser = vocUser == null ? null : vocUser.trim();
    }

    public String getApvUser() {
        return apvUser;
    }

    public void setApvUser(String apvUser) {
        this.apvUser = apvUser == null ? null : apvUser.trim();
    }

    public String getScanUser() {
        return scanUser;
    }

    public void setScanUser(String scanUser) {
        this.scanUser = scanUser == null ? null : scanUser.trim();
    }

    public String getScanDate() {
        return scanDate;
    }

    public void setScanDate(String scanDate) {
        this.scanDate = scanDate == null ? null : scanDate.trim();
    }

    public String getIsCheck() {
        return isCheck;
    }

    public void setIsCheck(String isCheck) {
        this.isCheck = isCheck == null ? null : isCheck.trim();
    }

    public String getIdentyUser() {
        return identyUser;
    }

    public void setIdentyUser(String identyUser) {
        this.identyUser = identyUser == null ? null : identyUser.trim();
    }

    public String getIdentyStatus() {
        return identyStatus;
    }

    public void setIdentyStatus(String identyStatus) {
        this.identyStatus = identyStatus == null ? null : identyStatus.trim();
    }

    public String getIdentyDate() {
        return identyDate;
    }

    public void setIdentyDate(String identyDate) {
        this.identyDate = identyDate == null ? null : identyDate.trim();
    }

    public BigDecimal getIdentyCount() {
        return identyCount;
    }

    public void setIdentyCount(BigDecimal identyCount) {
        this.identyCount = identyCount;
    }

    public String getIdentyType() {
        return identyType;
    }

    public void setIdentyType(String identyType) {
        this.identyType = identyType == null ? null : identyType.trim();
    }

    public BigDecimal getOutAmt() {
        return outAmt;
    }

    public void setOutAmt(BigDecimal outAmt) {
        this.outAmt = outAmt;
    }

    public String getImgDir() {
        return imgDir;
    }

    public void setImgDir(String imgDir) {
        this.imgDir = imgDir == null ? null : imgDir.trim();
    }

    public String getCaclTaxType() {
        return caclTaxType;
    }

    public void setCaclTaxType(String caclTaxType) {
        this.caclTaxType = caclTaxType == null ? null : caclTaxType.trim();
    }

    public String getVocFlag() {
        return vocFlag;
    }

    public void setVocFlag(String vocFlag) {
        this.vocFlag = vocFlag == null ? null : vocFlag.trim();
    }

    public String getTxType() {
        return txType;
    }

    public void setTxType(String txType) {
        this.txType = txType == null ? null : txType.trim();
    }

    public String getTxCode() {
        return txCode;
    }

    public void setTxCode(String txCode) {
        this.txCode = txCode == null ? null : txCode.trim();
    }

    public String getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(String seqNo) {
        this.seqNo = seqNo == null ? null : seqNo.trim();
    }

    public String getPayReqNo() {
        return payReqNo;
    }

    public void setPayReqNo(String payReqNo) {
        this.payReqNo = payReqNo == null ? null : payReqNo.trim();
    }

    public String getTxDate() {
        return txDate;
    }

    public void setTxDate(String txDate) {
        this.txDate = txDate == null ? null : txDate.trim();
    }

    public String getSysId() {
        return sysId;
    }

    public void setSysId(String sysId) {
        this.sysId = sysId == null ? null : sysId.trim();
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

    public String getDocType() {
        return docType;
    }

    public void setDocType(String docType) {
        this.docType = docType == null ? null : docType.trim();
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

    public String getCheckErrType() {
        return checkErrType;
    }

    public void setCheckErrType(String checkErrType) {
        this.checkErrType = checkErrType == null ? null : checkErrType.trim();
    }

    public String getFormCoding() {
        return formCoding;
    }

    public void setFormCoding(String formCoding) {
        this.formCoding = formCoding == null ? null : formCoding.trim();
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
        case VOC_CODE: {
            return getVocCode();
        }
        case VOC_NO: {
            return getVocNo();
        }
        case VOC_DATE: {
            return getVocDate();
        }
        case VOC_MAC: {
            return getVocMac();
        }
        case CUST_NO: {
            return getCustNo();
        }
        case BUY_NAME: {
            return getBuyName();
        }
        case BUY_TAX_NO: {
            return getBuyTaxNo();
        }
        case BUY_ADDR: {
            return getBuyAddr();
        }
        case BUY_TEL: {
            return getBuyTel();
        }
        case BUY_BANK_NO: {
            return getBuyBankNo();
        }
        case BUY_ACT_NO: {
            return getBuyActNo();
        }
        case SALE_NAME: {
            return getSaleName();
        }
        case SALE_TAX_NO: {
            return getSaleTaxNo();
        }
        case SALE_ADDR: {
            return getSaleAddr();
        }
        case SALE_TEL: {
            return getSaleTel();
        }
        case SALE_BANK_NO: {
            return getSaleBankNo();
        }
        case SALE_ACT_NO: {
            return getSaleActNo();
        }
        case REMARKS: {
            return getRemarks();
        }
        case PAYEE_NAME: {
            return getPayeeName();
        }
        case AMOUNT: {
            return (value = getAmount()) == null ? null : value.toString();
        }
        case TAX_AMT: {
            return (value = getTaxAmt()) == null ? null : value.toString();
        }
        case SUM_AMT: {
            return (value = getSumAmt()) == null ? null : value.toString();
        }
        case VOC_USER: {
            return getVocUser();
        }
        case APV_USER: {
            return getApvUser();
        }
        case SCAN_USER: {
            return getScanUser();
        }
        case SCAN_DATE: {
            return getScanDate();
        }
        case IS_CHECK: {
            return getIsCheck();
        }
        case IDENTY_USER: {
            return getIdentyUser();
        }
        case IDENTY_STATUS: {
            return getIdentyStatus();
        }
        case IDENTY_DATE: {
            return getIdentyDate();
        }
        case IDENTY_COUNT: {
            return (value = getIdentyCount()) == null ? null : value.toString();
        }
        case IDENTY_TYPE: {
            return getIdentyType();
        }
        case OUT_AMT: {
            return (value = getOutAmt()) == null ? null : value.toString();
        }
        case IMG_DIR: {
            return getImgDir();
        }
        case CACL_TAX_TYPE: {
            return getCaclTaxType();
        }
        case VOC_FLAG: {
            return getVocFlag();
        }
        case TX_TYPE: {
            return getTxType();
        }
        case TX_CODE: {
            return getTxCode();
        }
        case SEQ_NO: {
            return getSeqNo();
        }
        case PAY_REQ_NO: {
            return getPayReqNo();
        }
        case TX_DATE: {
            return getTxDate();
        }
        case SYS_ID: {
            return getSysId();
        }
        case CHECK_FLAG: {
            return getCheckFlag();
        }
        case CHECK_DESC: {
            return getCheckDesc();
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
        case DOC_TYPE: {
            return getDocType();
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
        case CHECK_ERR_TYPE: {
            return getCheckErrType();
        }
        case FORM_CODING: {
            return getFormCoding();
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

    public OdsVatIVoc set(Column column, String value) {
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
        case VOC_CODE: {
            setVocCode(value);
            break;
        }
        case VOC_NO: {
            setVocNo(value);
            break;
        }
        case VOC_DATE: {
            setVocDate(value);
            break;
        }
        case VOC_MAC: {
            setVocMac(value);
            break;
        }
        case CUST_NO: {
            setCustNo(value);
            break;
        }
        case BUY_NAME: {
            setBuyName(value);
            break;
        }
        case BUY_TAX_NO: {
            setBuyTaxNo(value);
            break;
        }
        case BUY_ADDR: {
            setBuyAddr(value);
            break;
        }
        case BUY_TEL: {
            setBuyTel(value);
            break;
        }
        case BUY_BANK_NO: {
            setBuyBankNo(value);
            break;
        }
        case BUY_ACT_NO: {
            setBuyActNo(value);
            break;
        }
        case SALE_NAME: {
            setSaleName(value);
            break;
        }
        case SALE_TAX_NO: {
            setSaleTaxNo(value);
            break;
        }
        case SALE_ADDR: {
            setSaleAddr(value);
            break;
        }
        case SALE_TEL: {
            setSaleTel(value);
            break;
        }
        case SALE_BANK_NO: {
            setSaleBankNo(value);
            break;
        }
        case SALE_ACT_NO: {
            setSaleActNo(value);
            break;
        }
        case REMARKS: {
            setRemarks(value);
            break;
        }
        case PAYEE_NAME: {
            setPayeeName(value);
            break;
        }
        case AMOUNT: {
            value = StringUtils.stripToNull(value);
            setAmount(value == null ? null : new BigDecimal(value));
            break;
        }
        case TAX_AMT: {
            value = StringUtils.stripToNull(value);
            setTaxAmt(value == null ? null : new BigDecimal(value));
            break;
        }
        case SUM_AMT: {
            value = StringUtils.stripToNull(value);
            setSumAmt(value == null ? null : new BigDecimal(value));
            break;
        }
        case VOC_USER: {
            setVocUser(value);
            break;
        }
        case APV_USER: {
            setApvUser(value);
            break;
        }
        case SCAN_USER: {
            setScanUser(value);
            break;
        }
        case SCAN_DATE: {
            setScanDate(value);
            break;
        }
        case IS_CHECK: {
            setIsCheck(value);
            break;
        }
        case IDENTY_USER: {
            setIdentyUser(value);
            break;
        }
        case IDENTY_STATUS: {
            setIdentyStatus(value);
            break;
        }
        case IDENTY_DATE: {
            setIdentyDate(value);
            break;
        }
        case IDENTY_COUNT: {
            value = StringUtils.stripToNull(value);
            setIdentyCount(value == null ? null : new BigDecimal(value));
            break;
        }
        case IDENTY_TYPE: {
            setIdentyType(value);
            break;
        }
        case OUT_AMT: {
            value = StringUtils.stripToNull(value);
            setOutAmt(value == null ? null : new BigDecimal(value));
            break;
        }
        case IMG_DIR: {
            setImgDir(value);
            break;
        }
        case CACL_TAX_TYPE: {
            setCaclTaxType(value);
            break;
        }
        case VOC_FLAG: {
            setVocFlag(value);
            break;
        }
        case TX_TYPE: {
            setTxType(value);
            break;
        }
        case TX_CODE: {
            setTxCode(value);
            break;
        }
        case SEQ_NO: {
            setSeqNo(value);
            break;
        }
        case PAY_REQ_NO: {
            setPayReqNo(value);
            break;
        }
        case TX_DATE: {
            setTxDate(value);
            break;
        }
        case SYS_ID: {
            setSysId(value);
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
        case DOC_TYPE: {
            setDocType(value);
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
        case CHECK_ERR_TYPE: {
            setCheckErrType(value);
            break;
        }
        case FORM_CODING: {
            setFormCoding(value);
            break;
        }
        default: {
            break;
        }}
        return this;
    }

    @Override
    public OdsVatIVoc set(String column, String value) {
        return set(Column.parse(column), value);
    }

    @Override
    public OdsVatIVoc set(Map<String, ?> map) {
        for (Column c: Column.values()) {
            if (map.containsKey(c.toString())) {
                Object v = map.get(c.toString());
                set(c, v == null ? null : v.toString());
            }
        }
        return this;
    }

    @Override
    public OdsVatIVoc set(AbstractTable table) {
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
        } else if (!(obj instanceof OdsVatIVoc)) {
            return false;
        }
        OdsVatIVoc rhs = (OdsVatIVoc) obj;
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
        if (getVocCode() != null) {
            builder.append("vocCode", getVocCode());
        }
        if (getVocNo() != null) {
            builder.append("vocNo", getVocNo());
        }
        if (getVocDate() != null) {
            builder.append("vocDate", getVocDate());
        }
        if (getVocMac() != null) {
            builder.append("vocMac", getVocMac());
        }
        if (getCustNo() != null) {
            builder.append("custNo", getCustNo());
        }
        if (getBuyName() != null) {
            builder.append("buyName", getBuyName());
        }
        if (getBuyTaxNo() != null) {
            builder.append("buyTaxNo", getBuyTaxNo());
        }
        if (getBuyAddr() != null) {
            builder.append("buyAddr", getBuyAddr());
        }
        if (getBuyTel() != null) {
            builder.append("buyTel", getBuyTel());
        }
        if (getBuyBankNo() != null) {
            builder.append("buyBankNo", getBuyBankNo());
        }
        if (getBuyActNo() != null) {
            builder.append("buyActNo", getBuyActNo());
        }
        if (getSaleName() != null) {
            builder.append("saleName", getSaleName());
        }
        if (getSaleTaxNo() != null) {
            builder.append("saleTaxNo", getSaleTaxNo());
        }
        if (getSaleAddr() != null) {
            builder.append("saleAddr", getSaleAddr());
        }
        if (getSaleTel() != null) {
            builder.append("saleTel", getSaleTel());
        }
        if (getSaleBankNo() != null) {
            builder.append("saleBankNo", getSaleBankNo());
        }
        if (getSaleActNo() != null) {
            builder.append("saleActNo", getSaleActNo());
        }
        if (getRemarks() != null) {
            builder.append("remarks", getRemarks());
        }
        if (getPayeeName() != null) {
            builder.append("payeeName", getPayeeName());
        }
        if (getAmount() != null) {
            builder.append("amount", getAmount());
        }
        if (getTaxAmt() != null) {
            builder.append("taxAmt", getTaxAmt());
        }
        if (getSumAmt() != null) {
            builder.append("sumAmt", getSumAmt());
        }
        if (getVocUser() != null) {
            builder.append("vocUser", getVocUser());
        }
        if (getApvUser() != null) {
            builder.append("apvUser", getApvUser());
        }
        if (getScanUser() != null) {
            builder.append("scanUser", getScanUser());
        }
        if (getScanDate() != null) {
            builder.append("scanDate", getScanDate());
        }
        if (getIsCheck() != null) {
            builder.append("isCheck", getIsCheck());
        }
        if (getIdentyUser() != null) {
            builder.append("identyUser", getIdentyUser());
        }
        if (getIdentyStatus() != null) {
            builder.append("identyStatus", getIdentyStatus());
        }
        if (getIdentyDate() != null) {
            builder.append("identyDate", getIdentyDate());
        }
        if (getIdentyCount() != null) {
            builder.append("identyCount", getIdentyCount());
        }
        if (getIdentyType() != null) {
            builder.append("identyType", getIdentyType());
        }
        if (getOutAmt() != null) {
            builder.append("outAmt", getOutAmt());
        }
        if (getImgDir() != null) {
            builder.append("imgDir", getImgDir());
        }
        if (getCaclTaxType() != null) {
            builder.append("caclTaxType", getCaclTaxType());
        }
        if (getVocFlag() != null) {
            builder.append("vocFlag", getVocFlag());
        }
        if (getTxType() != null) {
            builder.append("txType", getTxType());
        }
        if (getTxCode() != null) {
            builder.append("txCode", getTxCode());
        }
        if (getSeqNo() != null) {
            builder.append("seqNo", getSeqNo());
        }
        if (getPayReqNo() != null) {
            builder.append("payReqNo", getPayReqNo());
        }
        if (getTxDate() != null) {
            builder.append("txDate", getTxDate());
        }
        if (getSysId() != null) {
            builder.append("sysId", getSysId());
        }
        if (getCheckFlag() != null) {
            builder.append("checkFlag", getCheckFlag());
        }
        if (getCheckDesc() != null) {
            builder.append("checkDesc", getCheckDesc());
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
        if (getDocType() != null) {
            builder.append("docType", getDocType());
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
        if (getCheckErrType() != null) {
            builder.append("checkErrType", getCheckErrType());
        }
        if (getFormCoding() != null) {
            builder.append("formCoding", getFormCoding());
        }
        return builder.toString();
    }

    public OdsVatIVoc() {
        /* pass */
    }

    public OdsVatIVoc(Map<String, ?> map) {
        set(map);
    }

    public OdsVatIVoc(AbstractTable table) {
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
        VOC_CODE,
        VOC_NO,
        VOC_DATE,
        VOC_MAC,
        CUST_NO,
        BUY_NAME,
        BUY_TAX_NO,
        BUY_ADDR,
        BUY_TEL,
        BUY_BANK_NO,
        BUY_ACT_NO,
        SALE_NAME,
        SALE_TAX_NO,
        SALE_ADDR,
        SALE_TEL,
        SALE_BANK_NO,
        SALE_ACT_NO,
        REMARKS,
        PAYEE_NAME,
        AMOUNT,
        TAX_AMT,
        SUM_AMT,
        VOC_USER,
        APV_USER,
        SCAN_USER,
        SCAN_DATE,
        IS_CHECK,
        IDENTY_USER,
        IDENTY_STATUS,
        IDENTY_DATE,
        IDENTY_COUNT,
        IDENTY_TYPE,
        OUT_AMT,
        IMG_DIR,
        CACL_TAX_TYPE,
        VOC_FLAG,
        TX_TYPE,
        TX_CODE,
        SEQ_NO,
        PAY_REQ_NO,
        TX_DATE,
        SYS_ID,
        CHECK_FLAG,
        CHECK_DESC,
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
        DOC_TYPE,
        RSV1,
        RSV2,
        RSV3,
        RSV4,
        RSV5,
        CHECK_ERR_TYPE,
        FORM_CODING;

        public static Column parse(String column) {
            try {
                return Column.valueOf(column.toUpperCase());
            } catch (Exception e) {
                return null;
            }
        }
    }
}
