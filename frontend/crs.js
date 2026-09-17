function showcourse(){
    fetch("http://localhost:8081/Course")
    .then((response) => response.json())
    .then((courses) =>{
        const dataTable = document.getElementById("coursetable")
        courses.forEach(course => {
            var row =`
            <tr>
            <td>${course.courseid}</td>
            <td>${course.coursename}</td>
            <td>${course.trainer}</td>
            <td>${course.durationInWeeks}</td>
           </tr>
           `
           dataTable.innerHTML+=row;
            
        });

    });
}

    function showenrolledcourses(){
        fetch("http://localhost:8081/admin/course-enroll")
        .then((response) => response.json())
        .then((enrstu) =>{
            const endataTable=document.getElementById("enrollstuTable")
            enrstu.forEach(stu =>{
                var row=`<tr>
                <td>${stu.name}</td>
                <td>${stu.emailid}</td>
                <td>${stu.coursename}</td>
                </tr>`

                endataTable.innerHTML+=row;
            });

        });
    }
