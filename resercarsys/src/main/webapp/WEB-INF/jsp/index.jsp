<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Title</title>
    <link href="statics/css/index.css" rel="stylesheet"  />
</head>
<body>
    <form action="showInfos" method="post">
        快速查找:
        <select name="keyType">
            <option value="0">--请选择--</option>
            <option value="1">生产日期</option>
            <option value="2">车型</option>
            <option value="3">厂家</option>
        </select>
        <input type="text" name="val" />
        <input type="submit" value="查询" />
    </form>
    <table  width="100%" border="1">
        <tr>
            <td>车型</td>
            <td>排量</td>
            <td>年份</td>
            <td>厂家</td>
            <td>价格</td>
            <td>状态</td>
        </tr>
        <c:forEach items="${pager.datas}" var="carInfo">
            <tr>
                <td>${carInfo.car_Type}</td>
                <td>${carInfo.capacity}</td>
                <td>
                    <fmt:formatDate value="${carInfo.produce_Date}" pattern="yyyy" />
                </td>
                <td>${carInfo.manufacturer}</td>
                <td>${carInfo.price}</td>
                <td>
                    <c:if test="${carInfo.resever.status==0}">
                        可预订
                    </c:if>
                    <c:if test="${carInfo.resever.status==1}">
                        已预订
                    </c:if>
                </td>
            </tr>
        </c:forEach>
    </table>
    第 ${pager.pageNo} /${pager.totalPage} 页     -------------
    <a href="showInfos?pageNo=1">首页</a>
    <a href="showInfos?pageNo=${(pager.pageNo-1)<1 ? 1 : pager.pageNo-1 }">上一页</a>
    <a href="showInfos?pageNo=${(pager.pageNo+1) > pager.totalPage ? pager.totalPage : pager.pageNo+1 }">下一页</a>
    <a href="showInfos?pageNo=${pager.totalPage}">尾页</a>
</body>
</html>
