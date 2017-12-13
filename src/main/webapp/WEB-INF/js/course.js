
function add() {
    var course=$("#course").serialize();
    $.ajax({
        type:"post",
        url:"/addc",
        data:$("#course").serialize(),
        dataType:"text",
        success:function (data) {
            if(data=='1'){
                $('#courseid2').val($('#courseid1').val());
                $.ajax({
                    type:"post",
                    url:"/addcourseplan",
                    data:$("#courseplan").serialize(),
                    dateType:"text",
                    success:function (data) {
                        if(data=='1'){
                            $.messager.alert('提示','添加成功');
                            $("#course")[0].reset();
                            $("#courseplan")[0].reset();
                        }else{
                            $.messager.alert('提示','添加失败');
                        }
                    }
                })
            }else{
                alert("添加失败");
            }
        }
    });

}

/**
 * 修改
 */
function modify() {
    var course=$("#modifycourse").serialize();
    $.ajax({
        type:"post",
        url:"/modcourse",
        data:$("#modifycourse").serialize(),
        dataType:"text",
        success:function (data) {
            if(data=='1'){
                $('#modifycourseid2').val($('#modifycourseid1').val());
                $.ajax({
                    type:"post",
                    url:"/modcourseplan",
                    data:$("#modifycourseplan").serialize(),
                    dateType:"text",
                    success:function (data) {
                        if(data=='1'){
                            $.messager.alert('提示','修改成功');
                            $("#coursegrid").datagrid("reload");
                        }else{
                            $.messager.alert('提示','修改失败');
                        }
                    }
                })
            }else{
                $.messager.alert('提示','修改失败');
            }
        }
    });
}

function showcourseonload() {

//shoucourse.jsp
    $('#coursegrid').datagrid({
        title:'健生房课程',
        iconCls:'icon-edit',//图标
        width: 700,
        height: 'auto',
        nowrap: false,
        striped: true,
        border: true,
        collapsible:false,//是否可折叠的
        fit: true,//自动大小
        url:'/allcourse',
        //sortName: 'code',
        //sortOrder: 'desc',
        remoteSort:false,
        idField:'fldId',
        singleSelect:false,//是否单选
        pagination:true,//分页控件
        rownumbers:true,//行号
        frozenColumns:[[
            {field:'ck',checkbox:true}
        ]],
        toolbar: [{
            text: '详情',
            iconCls: 'icon-add',
            handler: function(id) {

                var obj=$("#coursegrid").datagrid("getSelections");
                if(obj!=null&&obj.length!=1){
                    $.messager.alert('提示','请选择一条');
                }else{
                    $('#showc').window({
                        width:500,
                        height:600,
                        modal:true
                    });

                    $.ajax({
                        type:'post',
                        data:{"id":obj[0].courseid},
                        url:'/findcourseandplan',
                        success:function (data) {
                            $('#showcourse').form('load',data.course);
                            $('#showcourseplan').form('load',data.plan);
                        }
                    })
                }
            }
        }, '-', {
            text: '修改',
            iconCls: 'icon-edit',
            handler: function() {
                var obj=$("#coursegrid").datagrid("getSelections");
                if(obj!=null&&obj.length!=1){
                    $.messager.alert('提示','请选择一条');
                }else{
                    $('#modify').window({
                        width:500,
                        height:600,
                        modal:true
                    });

                   $.ajax({
                       type:'post',
                       data:{"id":obj[0].courseid},
                       url:'/findcourseandplan',
                       success:function (data) {
                           $('#modifycourse').form('load',data.course);
                           $('#modifycourseplan').form('load',data.plan);
                       }
                   })
                }
            }
        }, '-',{
            text: '删除',
            iconCls: 'icon-remove',
            handler: function(){
                var obj=$("#coursegrid").datagrid("getSelections");
                if(obj!=null){
                    for(var i=0;i<obj.length;i++){
                    $.ajax({
                        type:'post',
                        data:{"id":obj[i].courseid},
                        url:'/delcourse',
                        success:function (data) {
                            if(data=="1"){

                            }
                        }
                    })
                }
                $.messager.alert("提示","删除成功")
                $("#coursegrid").datagrid("reload");

                }
            }
        }],
    });
//设置分页控件
    var p = $('#coursegrid').datagrid('getPager');
    $(p).pagination({
        pageSize: 10,//每页显示的记录条数，默认为10
        pageList: [5,10,15],//可以设置每页记录条数的列表
        beforePageText: '第',//页数文本框前显示的汉字
        afterPageText: '页    共 {pages} 页',
        displayMsg: '当前显示 {from} - {to} 条记录   共 {total} 条记录',
        onBeforeRefresh:function(){
            $(this).pagination('loading');
            alert('before refresh');
            $(this).pagination('loaded');
        }
    });

}
//假数据
function sta02() {
    $(function () {
        // Radialize the colors
        Highcharts.getOptions().colors = Highcharts.map(Highcharts.getOptions().colors, function (color) {
            return {
                radialGradient: { cx: 0.5, cy: 0.3, r: 0.7 },
                stops: [
                    [0, color],
                    [1, Highcharts.Color(color).brighten(-0.3).get('rgb')] // darken
                ]
            };
        });
        // 构建图表
        $('#container02').highcharts({
            chart: {
                plotBackgroundColor: null,
                plotBorderWidth: null,
                plotShadow: false
            },
            title: {
                text: '三建客员工占比'
            },
            tooltip: {
                pointFormat: '{series.name}: <b>{point.percentage:.1f}%</b>'
            },
            plotOptions: {
                pie: {
                    allowPointSelect: true,
                    cursor: 'pointer',
                    dataLabels: {
                        enabled: true,
                        format: '<b>{point.name}</b>: {point.percentage:.1f} %',
                        style: {
                            color: (Highcharts.theme && Highcharts.theme.contrastTextColor) || 'black'
                        },
                        connectorColor: 'silver'
                    }
                }
            },
            series: [{
                type: 'pie',
                name: '员工占比',
                data: [
                    ['前台',   6],
                    ['教练',   14],
                    {
                        name: '老板',
                        y: 4,
                        sliced: true,
                        selected: true
                    },
                    ['店长',    3],
                    ['销售经理',     4],
                    ['销售',   12],
                    ['会籍经理',   3]
                ]
            }]
        });
    });

}

//假数据
function sta01() {
    $(function () {
        $('#container01').highcharts({
            chart: {
                plotBackgroundColor: null,
                plotBorderWidth: 0,
                plotShadow: false
            },
            title: {
                text: '会员卡<br>占比',
                align: 'center',
                verticalAlign: 'middle',
                y: 50
            },
            tooltip: {
                headerFormat: '{series.name}<br>',
                pointFormat: '{point.name}: <b>{point.percentage:.1f}%</b>'
            },
            plotOptions: {
                pie: {
                    dataLabels: {
                        enabled: true,
                        distance: -50,
                        style: {
                            fontWeight: 'bold',
                            color: 'white',
                            textShadow: '0px 1px 2px black'
                        }
                    },
                    startAngle: -90,
                    endAngle: 90,
                    center: ['50%', '75%']
                }
            },
            series: [{
                type: 'pie',
                name: '会员卡占比',
                innerSize: '50%',
                data: [
                    ['半年卡',   45.0],
                    ['年卡',       26.8],
                    ['月卡', 12.8],
                    ['季卡',    8.5],
                    {
                        name: '其他',
                        y: 0.7,
                        dataLabels: {
                            // 数据比较少，没有空间显示数据标签，所以将其关闭
                            enabled: false
                        }
                    }
                ]
            }]
        });
    });
}

//假数据
function sta1() {
    // Create the chart
    Highcharts.chart('container', {
        chart: {
            type: 'column'
        },
        title: {
            text: '2017年12月，各课程份额'
        },
        subtitle: {
            text: ''
        },
        xAxis: {
            type: 'category'
        },
        yAxis: {
            title: {
                text: '总的份额'
            }
        },
        legend: {
            enabled: false
        },
        plotOptions: {
            series: {
                borderWidth: 0,
                dataLabels: {
                    enabled: true,
                    format: '{point.y:.1f}%'
                }
            }
        },
        tooltip: {
            headerFormat: '<span style="font-size:11px">{series.name}</span><br>',
            pointFormat: '<span style="color:{point.color}">{point.name}</span>: <b>{point.y:.2f}%</b> of total<br/>'
        },
        series: [{
            name: '课程类型',
            colorByPoint: true,
            data: [{
                name: '瑜伽',
                y: 56.33,
                drilldown: '瑜伽'
            }, {
                name: '杠铃操',
                y: 24.03,
                drilldown: '杠铃操'
            }, {
                name: '动感单车',
                y: 10.38,
                drilldown: '动感单车'
            }, {
                name: '搏击操',
                y: 4.77,
                drilldown: '搏击操'
            }, {
                name: '肚皮舞',
                y: 0.91,
                drilldown: '肚皮舞'
            }, {
                name: '其他',
                y: 0.2,
                drilldown: null
            }]
        }],
        drilldown: {
            series: [{
                name: '瑜伽',
                id: '瑜伽',
                data: [
                    [
                        'v11.0',
                        24.13
                    ],
                    [
                        'v8.0',
                        17.2
                    ],
                    [
                        'v9.0',
                        8.11
                    ],
                    [
                        'v10.0',
                        5.33
                    ],
                    [
                        'v6.0',
                        1.06
                    ],
                    [
                        'v7.0',
                        0.5
                    ]
                ]
            }, {
                name: '杠铃操',
                id: '杠铃操',
                data: [
                    [
                        'v40.0',
                        5
                    ],
                    [
                        'v41.0',
                        4.32
                    ],
                    [
                        'v42.0',
                        3.68
                    ],
                    [
                        'v39.0',
                        2.96
                    ],
                    [
                        'v36.0',
                        2.53
                    ],
                    [
                        'v43.0',
                        1.45
                    ],
                    [
                        'v31.0',
                        1.24
                    ],
                    [
                        'v35.0',
                        0.85
                    ],
                    [
                        'v38.0',
                        0.6
                    ],
                    [
                        'v32.0',
                        0.55
                    ],
                    [
                        'v37.0',
                        0.38
                    ],
                    [
                        'v33.0',
                        0.19
                    ],
                    [
                        'v34.0',
                        0.14
                    ],
                    [
                        'v30.0',
                        0.14
                    ]
                ]
            }, {
                name: '动感单车',
                id: '动感单车',
                data: [
                    [
                        'v35',
                        2.76
                    ],
                    [
                        'v36',
                        2.32
                    ],
                    [
                        'v37',
                        2.31
                    ],
                    [
                        'v34',
                        1.27
                    ],
                    [
                        'v38',
                        1.02
                    ],
                    [
                        'v31',
                        0.33
                    ],
                    [
                        'v33',
                        0.22
                    ],
                    [
                        'v32',
                        0.15
                    ]
                ]
            }, {
                name: '搏击操',
                id: '搏击操',
                data: [
                    [
                        'v8.0',
                        2.56
                    ],
                    [
                        'v7.1',
                        0.77
                    ],
                    [
                        'v5.1',
                        0.42
                    ],
                    [
                        'v5.0',
                        0.3
                    ],
                    [
                        'v6.1',
                        0.29
                    ],
                    [
                        'v7.0',
                        0.26
                    ],
                    [
                        'v6.2',
                        0.17
                    ]
                ]
            }, {
                name: '肚皮舞',
                id: '肚皮舞',
                data: [
                    [
                        'v12.x',
                        0.34
                    ],
                    [
                        'v28',
                        0.24
                    ],
                    [
                        'v27',
                        0.17
                    ],
                    [
                        'v29',
                        0.16
                    ]
                ]
            }]
        }
    });
}
