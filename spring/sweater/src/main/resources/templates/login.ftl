<#import "parts/common.ftl" as c>
<#import "parts/login.ftl" as l>

<@c.page>
<<<<<<< HEAD
    <#if Session?? && Session.SPRING_SECURITY_LAST_EXCEPTION??>
        <div class="alert alert-danger" role="alert">
            ${Session.SPRING_SECURITY_LAST_EXCEPTION.message}
        </div>
    </#if>
    <#if message??>
        <div class="alert alert-${messageType}" role="alert">
            ${message}
        </div>
    </#if>
    <@l.login "/login" false/>
=======
<#if Session?? && Session.SPRING_SECURITY_LAST_EXCEPTION??>
    <div class="alert alert-danger" role="alert">
        ${Session.SPRING_SECURITY_LAST_EXCEPTION.message}
    </div>
  </#if>
    <@l.login "/login" false />
>>>>>>> 89e928ee75cd57625742030ddf41bf01e2a36d04
</@c.page>