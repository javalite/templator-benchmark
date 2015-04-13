<@content for="title">Templator Benchmark</@content>

<h2>Templator Benchmark</h2>


<table>

    <tr>
        <th>First name</th>
        <th>Last name</th>
    </tr>
    <#list people as person>
        <tr>
            <td>${person.firstName}</td>
            <td>${person.lastName}</td>
        </tr>
    </#list>
</table>

