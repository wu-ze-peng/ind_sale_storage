<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org"
      xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3">
<head>
    <title>Hello World!</title>
</head>
<body>
    hello world!
    ${index}
    <#if index?number == 1>
        ${item.index}
    <#else>产品
        ${item.name}
    </#if>
</body>